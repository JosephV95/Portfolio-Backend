
package com.miportfolio.jose.controller;

import com.miportfolio.jose.model.SkillBack;
import com.miportfolio.jose.service.ISkillBackService;
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
@RequestMapping({"/skill-back/"})
public class SkillBackController {
    
    @Autowired
    ISkillBackService sbServ;
    
    @GetMapping
    public List<SkillBack>listar(){
        return sbServ.verSkillsBack();
    }
    
    @PostMapping
    public void agregarSkillBack(@RequestBody SkillBack sb) {
        sbServ.crearSkillBack(sb);
        System.out.println("La Skill se agrego correctamente"); 
    }
    @GetMapping("sb-edit/{id}")
    public ResponseEntity<SkillBack> buscarSkillBack(@PathVariable int id) {
        SkillBack skillBack = sbServ.buscarSkillBackId(id);
        return ResponseEntity.ok(skillBack);
    }
    @PutMapping("sb-edit/{id}")
    public SkillBack editarSkillBack(@PathVariable int id, @RequestBody SkillBack sb){
        sb.setId(id);
        System.out.println("Se actualizo la skill");
        return sbServ.edit(sb);
    }
    
    @DeleteMapping("delete/{id}")
    public void borrarSkillBack(@PathVariable int id){
        sbServ.borrarSkillBack(id);
        System.out.println("Se borro la skill");
    }
    
}
