
package com.miportfolio.jose.controller;

import com.miportfolio.jose.model.Educacion;
import com.miportfolio.jose.service.IEducacionService;
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
public class EducacionController {
    
    @Autowired
    public IEducacionService eduServ;
    
    @PostMapping("/educacion/crear")
    public void agregarEducacion(@RequestBody Educacion edu) {
        eduServ.crearEducacion(edu);
        System.out.println("La educación se agrego correctamente"); 
    }
    
    @GetMapping("/educacion/ver")
    @ResponseBody
    public List<Educacion> verEducacion() {
        return eduServ.verEducacion();
    }
    
    @DeleteMapping("/educacion/borrar/{id}")
    public String borrarEducacion(@PathVariable Long id){
        eduServ.borrarEducacion(id);
        return "La Educacion se borro correctamente";
    }
    
    @PutMapping ("/educacion/editar/{id}")
    public Educacion editarEducacion(@PathVariable Long id,
                                                  @RequestParam("nomInst") String nuevoNomInst,
                                                  @RequestParam("grado") String nuevoGrado,
                                                  @RequestParam("titulo") String nuevoTitulo) {
        Educacion educacion = eduServ.buscarEducacion(id);
        
        educacion.setNomInst(nuevoNomInst);
        educacion.setGrado(nuevoGrado);
        educacion.setTitulo(nuevoTitulo);
        
        eduServ.crearEducacion(educacion);
        return educacion;
    }
    
    @GetMapping("/educacion/traer/{id}")
    public Educacion buscarEducacion(@PathVariable Long id){
        return eduServ.buscarEducacion(id);
    }
    

    
    
    
}
