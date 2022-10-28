
package com.miportfolio.jose.controller;

import com.miportfolio.jose.model.SkillFront;
import com.miportfolio.jose.service.ISkillFrontService;
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
@RequestMapping({"/skill-front/"})
public class SkillFrontController {
    
    @Autowired
    ISkillFrontService sfServ;
    
    @GetMapping
    public List<SkillFront>listar(){
        return sfServ.verSkillsFront();
    }
    
    @PostMapping
    public void agregarSkillFront(@RequestBody SkillFront sf) {
        sfServ.crearSkillFront(sf);
        System.out.println("La Skill se agrego correctamente"); 
    }
    @GetMapping("sf-edit/{id}")
    public ResponseEntity<SkillFront> buscarSkillFront(@PathVariable int id) {
        SkillFront skillFront = sfServ.buscarSkillFrontId(id);
        return ResponseEntity.ok(skillFront);
    }
    @PutMapping("sf-edit/{id}")
    public SkillFront editarSkillFront(@PathVariable int id, @RequestBody SkillFront sf){
        sf.setId(id);
        System.out.println("Se actualizo la skill");
        return sfServ.edit(sf);
    }
    
    @DeleteMapping("/delete/{id}")
    public void borrarSkillFront(@PathVariable int id){
        sfServ.borrarSkillFront(id);
        System.out.println("Se borro la skill");
    }
    
    
}
