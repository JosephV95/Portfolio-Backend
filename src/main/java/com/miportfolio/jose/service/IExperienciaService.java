package com.miportfolio.jose.service;

import com.miportfolio.jose.model.Experiencia;
import java.util.List;


public interface IExperienciaService {
    List<Experiencia>listar();
    Experiencia listarId(int id);
    void add(Experiencia exp);
    Experiencia edit(Experiencia exp);
    void delete(int id);
    
}
