package com.miportfolio.jose.controller;

import com.miportfolio.jose.model.Persona;
import com.miportfolio.jose.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
//con el corsoring evito el error CORS policy y permite que el localhost:4200 llame al :8080 de tomcat(NetBeans)
public class Controller {
    
    @Autowired
    private IPersonaService persoServ ;
    
    @PostMapping("/personas/crear")
    public void agregarPersona (@RequestBody Persona pers){
        persoServ.crearPersona(pers);
        System.out.println("La persona se agrego correctamente");
        
    }
    
    @GetMapping("/personas/ver")
    @ResponseBody
    public List<Persona> verPersonas () {
    return persoServ.verPersonas();
    }
    
    @DeleteMapping ("/personas/borrar/{id}")
    public String borrarPersona (@PathVariable Long id){
        persoServ.borrarPersona(id);
        return "La persona se borro correctamente";
    }
    
    //Para editar una persona//
    @PutMapping ("/personas/editar/{id}")
    public Persona editarPersona (@PathVariable Long id,
                                                  @RequestParam("nombre") String nuevoNombre,
                                                  @RequestParam("apellido") String nuevoApellido,
                                                  @RequestParam("foto_url") String nuevaFoto) {
        Persona persona = persoServ.buscarPersona(id);
        
        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        persona.setFoto_url(nuevaFoto);
        
        persoServ.crearPersona(persona);
        return persona;
    }
    
    @GetMapping("/personas/traer/perfil/{id}")
    public Persona buscarPersona(@PathVariable Long id){
        return persoServ.buscarPersona( id);
      
    }
    
    
   
}