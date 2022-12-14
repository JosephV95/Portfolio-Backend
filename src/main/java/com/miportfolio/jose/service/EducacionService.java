package com.miportfolio.jose.service;

import com.miportfolio.jose.model.Educacion;
import com.miportfolio.jose.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService{
    
    @Autowired 
    public EducacionRepository eduRepo;

    @Override
    public List<Educacion> verEducaciones() {
        return eduRepo.findAll();
    }

    @Override
    public void crearEducacion(Educacion edu) {
        eduRepo.save(edu);
    }

    @Override
    public void borrarEducacion(int id) {
        eduRepo.deleteById(id);
    }

    @Override
    public Educacion buscarEducacion(int id) {
        return eduRepo.findById(id);
    }

    @Override
    public Educacion edit(Educacion exp) {
        return eduRepo.save(exp);
    }

}
