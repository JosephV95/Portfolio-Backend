package com.miportfolio.jose.service;

import com.miportfolio.jose.model.Proyecto;
import com.miportfolio.jose.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService{
    
    @Autowired 
    public ProyectoRepository proRepo;

    @Override
    public List<Proyecto> verProyectos() {
        return proRepo.findAll();
    }

    @Override
    public void crearProyecto(Proyecto pro) {
        proRepo.save(pro);
    }

    @Override
    public void borrarProyecto(int id) {
        proRepo.deleteById(id);
    }

    @Override
    public Proyecto buscarProyectoId(int id) {
        return proRepo.findById(id);
    }

    @Override
    public Proyecto edit(Proyecto pro) {
        return proRepo.save(pro);
    }
    
}
