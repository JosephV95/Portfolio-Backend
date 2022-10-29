package com.miportfolio.jose.service;

import com.miportfolio.jose.model.Persona;
import com.miportfolio.jose.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class PersonaService implements IPersonaService {

    @Autowired
    public PersonaRepository persoRepo;

    @Override
    public List<Persona> verPersona() {
        return persoRepo.findAll();
    }

    @Override
    public void crearPersona(Persona per) {
        persoRepo.save(per);
    }

    @Override
    public void borrarPersona(int id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Persona buscarPersona(int id) {
        return persoRepo.findById(id);
    }

    @Override
    public Persona edit(Persona per) {
        return persoRepo.save(per);
    }
    


 
}
