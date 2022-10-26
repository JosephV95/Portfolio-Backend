
package com.miportfolio.jose.controller;

import com.miportfolio.jose.model.Proyecto;
import com.miportfolio.jose.service.IProyectoService;
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
@RequestMapping({"/proyecto/"})
public class ProyectoController {
    
    @Autowired
    IProyectoService proServ;
    
    @GetMapping
    public List<Proyecto>listar(){
        return proServ.verProyectos();
    }
    
    @PostMapping
    public void agregarProyecto(@RequestBody Proyecto pro) {
        proServ.crearProyecto(pro);
        System.out.println("El Proyecto se agrego correctamente"); 
    }
    @GetMapping( "pro-edit/{id}")
    public ResponseEntity<Proyecto> buscarProyecto(@PathVariable int id) {
        Proyecto proyecto = proServ.buscarProyectoId(id);
        return ResponseEntity.ok(proyecto);
    }
    @PutMapping("pro-edit/{id}")
    public Proyecto editarProyecto(@PathVariable int id, @RequestBody Proyecto pro){
        pro.setId(id);
        System.out.println("Se actualizo el proyecto");
        return proServ.edit(pro);
    }
    
    @DeleteMapping("/delete/{id}")
    public void borrarProyecto(@PathVariable int id){
        proServ.borrarProyecto(id);
        System.out.println("Se borro el proyecto");
    }
    
}
