package com.miportfolio.jose.service;

import com.miportfolio.jose.model.Educacion;
import java.util.List;


public interface IEducacionService {
    
    public List <Educacion> verEducaciones ();
    public void crearEducacion (Educacion edu);
    public void borrarEducacion (int id);
    public Educacion buscarEducacion (int id);
    Educacion edit(Educacion exp);

    
}
