package com.miportfolio.jose.service;

import com.miportfolio.jose.model.SkillSoft;
import com.miportfolio.jose.repository.SkillSoftRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillSoftService implements ISkillSoftService{
    
    @Autowired 
    public SkillSoftRepository ssRepo;

    @Override
    public List<SkillSoft> verSkillsSoft() {
        return ssRepo.findAll();
    }

    @Override
    public void crearSkillSoft(SkillSoft ss) {
        ssRepo.save(ss);
    }

    @Override
    public void borrarSkillSoft(int id) {
        ssRepo.deleteById(id);
    }

    @Override
    public SkillSoft buscarSkillSoftId(int id) {
        return ssRepo.findById(id);
    }

    @Override
    public SkillSoft edit(SkillSoft ss) {
       return ssRepo.save(ss);
    }
    
}
