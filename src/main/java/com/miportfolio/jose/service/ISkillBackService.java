
package com.miportfolio.jose.service;

import com.miportfolio.jose.model.SkillBack;
import java.util.List;


public interface ISkillBackService {
    
    public List<SkillBack>verSkillsBack();
    public void crearSkillBack(SkillBack sb);
    public void borrarSkillBack(int id);
    public SkillBack buscarSkillBackId(int id);
    
    public SkillBack edit(SkillBack sb);
}
