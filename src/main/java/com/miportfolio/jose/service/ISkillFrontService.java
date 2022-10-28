package com.miportfolio.jose.service;

import com.miportfolio.jose.model.SkillFront;
import java.util.List;

public interface ISkillFrontService {
    
    public List<SkillFront>verSkillsFront();
    public void crearSkillFront(SkillFront sf);
    public void borrarSkillFront(int id);
    public SkillFront buscarSkillFrontId(int id);
    
    public SkillFront edit(SkillFront sf);
}
