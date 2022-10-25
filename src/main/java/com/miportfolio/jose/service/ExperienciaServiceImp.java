
package com.miportfolio.jose.service;

import com.miportfolio.jose.model.Experiencia;
import com.miportfolio.jose.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ExperienciaServiceImp  implements IExperienciaService{
    @Autowired
    private ExperienciaRepository experiencia;

    @Override
    public List<Experiencia> listar() {
        return  experiencia.findAll();
    }

    @Override
    public Experiencia listarId(int id) {
        return experiencia.findById(id);
    }

    @Override
    @Transactional   //tiene algo que ver con la Base de datos (Revisar Funcionamiento)
    public void add(Experiencia exp) {
        experiencia.save(exp);
    }

    @Override
    public Experiencia edit(Experiencia exp) {
        return experiencia.save(exp);
    }

    @Override
    public void delete(int id) {
        experiencia.deleteById(id);
    }
    
}
