
package com.miportfolio.jose.controller;

import com.miportfolio.jose.model.Experiencia;
import com.miportfolio.jose.service.IExperienciaService;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping({"/experiencia/"})
public class ExperienciaController {
    
    @Autowired
    IExperienciaService service;
    
    @GetMapping
    public List<Experiencia>listar(){
        return service.listar();
    }
    @PostMapping
    public void agregar(@RequestBody Experiencia exp){
        System.out.println("La persona se agrego correctamente");   // le agregue mensaje }de que se agrego corrctamente  

        service.add(exp);
    }
    // Hasta todo bien
    @GetMapping( "edit/{id}")
    public ResponseEntity<Experiencia> listarId(@PathVariable int id) {
        Experiencia experiencia =service.listarId(id);
        return ResponseEntity.ok(experiencia);
    }
    //@PutMapping("edit/{id}")
    //public Experiencia editar(@RequestBody Experiencia exp, @PathVariable int id ){
    //    exp.setId(id);
    //    return service.edit(exp);
    //}
    @PutMapping ("edit/{id}")
    public Experiencia editar (@PathVariable int id,
                                                  @RequestBody Experiencia  nuevoNombreExp,
                                                  @RequestBody Experiencia  nuevoAniosExp,
                                                  @RequestBody Experiencia  nuevoDescExp){
        Experiencia experiencia = service.listarId(id);
        
        experiencia.setNomExp(nuevoNombreExp.getNomExp());
        experiencia.setAniosExp(nuevoAniosExp.getAniosExp());
        experiencia.setDescripcionExp(nuevoDescExp.getDescripcionExp());
        
        //service.add(experiencia);
        service.add(experiencia);
        return experiencia;
    }
    
    @DeleteMapping("delete/{id}")
    public void delete (@PathVariable int id){
        service.delete(id);
    }
    
}
