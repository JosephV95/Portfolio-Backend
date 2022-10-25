
package com.miportfolio.jose.controller;

import com.miportfolio.jose.model.Educacion;
import com.miportfolio.jose.service.IEducacionService;
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
@RequestMapping({"/educacion/"})
public class EducacionController {
    
    @Autowired
    IEducacionService eduServ;
    
     @GetMapping
    public List<Educacion>listar(){
        return eduServ.verEducaciones();
    }
    
    @PostMapping
    public void agregarEducacion(@RequestBody Educacion edu) {
        eduServ.crearEducacion(edu);
        System.out.println("La educación se agrego correctamente"); 
    }
    @GetMapping( "edit/{id}")
    public ResponseEntity<Educacion> buscarEducacion(@PathVariable int id) {
        Educacion educacion = eduServ.buscarEducacion(id);
        return ResponseEntity.ok(educacion);
    }
    @PutMapping("edit/{id}")
    public Educacion editarEducacion(@PathVariable int id, @RequestBody Educacion edu){
        edu.setId(id);
        return eduServ.edit(edu);
    }
    
    @DeleteMapping("/delete/{id}")
    public void borrarEducacion(@PathVariable int id){
        eduServ.borrarEducacion(id);
        System.out.println("Se borro la educación");
    }
    
}
