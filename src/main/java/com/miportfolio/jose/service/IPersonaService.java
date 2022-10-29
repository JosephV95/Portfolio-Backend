package com.miportfolio.jose.service;

import com.miportfolio.jose.model.Persona;
import java.util.List;

public interface IPersonaService {
    
    public List<Persona>verPersona();
    public void crearPersona(Persona per);
    public void borrarPersona(int id);
    public Persona buscarPersona(int id);
    
    public Persona edit(Persona per);
}
