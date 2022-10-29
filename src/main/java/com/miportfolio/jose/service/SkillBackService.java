package com.miportfolio.jose.service;

import com.miportfolio.jose.model.SkillBack;
import com.miportfolio.jose.repository.SkillBackRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillBackService implements ISkillBackService{
    
    @Autowired 
    public SkillBackRepository sbRepo;

    @Override
    public List<SkillBack> verSkillsBack() {
       return sbRepo.findAll();
    }

    @Override
    public void crearSkillBack(SkillBack sb) {
        sbRepo.save(sb);
    }

    @Override
    public void borrarSkillBack(int id) {
    sbRepo.deleteById(id);
    }

    @Override
    public SkillBack buscarSkillBackId(int id) {
        return sbRepo.findById(id);
    }

    @Override
    public SkillBack edit(SkillBack sb) {
        return sbRepo.save(sb);
    }
    
    
    
}
