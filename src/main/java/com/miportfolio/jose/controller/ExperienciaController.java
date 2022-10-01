package com.miportfolio.jose.controller;

import com.miportfolio.jose.model.Experiencia;
import com.miportfolio.jose.service.IExperienciaService;
import java.util.List;
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
public class ExperienciaController {
       
    public IExperienciaService expServ;
    
    @PostMapping("/experiencia/crear")
    public void agregarExperiencia(@RequestBody Experiencia exp) {
        expServ.crearExperiencia(exp);
        System.out.println("La experiencia se agrego correctamente"); 
    }
    
    @GetMapping("/experiencia/ver")
    @ResponseBody
    public List<Experiencia> verExperiencia() {
        return expServ.verExperiencia();
    }
    @DeleteMapping("/experiencia/borrar/{id}")
    public String borrarEducacion(@PathVariable Long id){
        expServ.borrarExperiencia(id);
        return "La Experiencia se borro correctamente";
    }
    
    @PutMapping ("/experiencia/editar/{id}")
    public Experiencia editarEducacion(@PathVariable Long id,
                                                  @RequestParam("nomExp") String nuevoNomExp,
                                                  @RequestParam("descripcionExp") String nuevoDescripcionExp) {
                                                  
        Experiencia experiencia = expServ.buscarExperiencia(id);
        
        experiencia.setNomExp(nuevoNomExp);
        experiencia.setDescripcionExp(nuevoDescripcionExp);
                
        expServ.crearExperiencia(experiencia);
        return experiencia;
    }
    @GetMapping("/experiencia/traer/{id}")
    public Experiencia buscarExperiencia(@PathVariable Long id){
        return expServ.buscarExperiencia(id);
    }
}
