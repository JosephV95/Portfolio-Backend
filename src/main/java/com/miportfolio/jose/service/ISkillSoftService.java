
package com.miportfolio.jose.service;

import com.miportfolio.jose.model.SkillSoft;
import java.util.List;


public interface ISkillSoftService {
    
    public List<SkillSoft>verSkillsSoft();
    public void crearSkillSoft(SkillSoft ss);
    public void borrarSkillSoft(int id);
    public SkillSoft buscarSkillSoftId(int id);
    
    public SkillSoft edit(SkillSoft ss);
    
}
