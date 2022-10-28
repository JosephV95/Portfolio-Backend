package com.miportfolio.jose.service;

import com.miportfolio.jose.model.SkillFront;
import com.miportfolio.jose.repository.SkillFrontRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillFrontService implements ISkillFrontService{
    
    @Autowired 
    public SkillFrontRepository sfRepo;

    @Override
    public List<SkillFront> verSkillsFront() {
        return sfRepo.findAll();
    }

    @Override
    public void crearSkillFront(SkillFront sf) {
       sfRepo.save(sf);
    }

    @Override
    public void borrarSkillFront(int id) {
        sfRepo.deleteById(id);
    }

    @Override
    public SkillFront buscarSkillFrontId(int id) {
        return sfRepo.findById(id);
    }

    @Override
    public SkillFront edit(SkillFront sf) {
        return sfRepo.save(sf);
    }
    
}
