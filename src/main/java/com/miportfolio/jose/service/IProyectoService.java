package com.miportfolio.jose.service;

import com.miportfolio.jose.model.Proyecto;
import java.util.List;

public interface IProyectoService {
    
    public List<Proyecto>verProyectos();
    public void crearProyecto(Proyecto pro);
    public void borrarProyecto(int id);
    public Proyecto buscarProyectoId(int id);
    
    public Proyecto edit(Proyecto pro);
    
    
}
