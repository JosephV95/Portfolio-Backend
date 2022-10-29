
package com.miportfolio.jose.controller;

import com.miportfolio.jose.model.SkillSoft;
import com.miportfolio.jose.service.ISkillSoftService;
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
@RequestMapping({"/skill-soft/"})
public class SkillSoftController {
    
    @Autowired
    ISkillSoftService ssServ;
    
    @GetMapping
    public List<SkillSoft>listar(){
        return ssServ.verSkillsSoft();
    }
    
    @PostMapping
    public void agregarSkillSoft(@RequestBody SkillSoft ss) {
        ssServ.crearSkillSoft(ss);
        System.out.println("La Skill se agrego correctamente"); 
    }
    @GetMapping("ss-edit/{id}")
    public ResponseEntity<SkillSoft> buscarSkillSoft(@PathVariable int id) {
        SkillSoft skillSoft = ssServ.buscarSkillSoftId(id);
        return ResponseEntity.ok(skillSoft);
    }
    @PutMapping("ss-edit/{id}")
    public SkillSoft editarSkillBack(@PathVariable int id, @RequestBody SkillSoft ss){
        ss.setId(id);
        System.out.println("Se actualizo la skill");
        return ssServ.edit(ss);
    }
    @DeleteMapping("delete/{id}")
    public void borrarSkillSoft(@PathVariable int id){
        ssServ.borrarSkillSoft(id);
        System.out.println("Se borro la skill");
    }
}
