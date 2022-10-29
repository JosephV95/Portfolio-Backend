package com.miportfolio.jose.controller;

import com.miportfolio.jose.model.Persona;
import com.miportfolio.jose.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
//con el corsoring evito el error CORS policy y permite que el localhost:4200 llame al :8080 de tomcat(NetBeans)
@RequestMapping({"/personas/"})

public class Controller {
    
    @Autowired
    IPersonaService persoServ ;
    
    @GetMapping
    public List<Persona>listar(){
        return persoServ.verPersona();
    }
    @PostMapping
    public void agregarPersona(@RequestBody Persona per) {
        persoServ.crearPersona(per);
        System.out.println("La Persona se agrego correctamente"); 
    }
    @GetMapping("editar/{id}")
    public ResponseEntity<Persona> buscarPersona(@PathVariable int id) {
        Persona persona = persoServ.buscarPersona(id);
        return ResponseEntity.ok(persona);
    }
    @PutMapping("editar/{id}")
    public Persona editarPersona(@PathVariable int id, @RequestBody Persona per){
        per.setId(id);
        System.out.println("Se actualizo la persona");
        return persoServ.edit(per);
    }
    @DeleteMapping("delete/{id}")
    public void borrarPersona(@PathVariable int id){
        persoServ.borrarPersona(id);
        System.out.println("Se borro la persona");
    }
    

    
    
   
}