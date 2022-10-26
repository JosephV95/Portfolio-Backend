
package com.miportfolio.jose.repository;

import com.miportfolio.jose.model.Proyecto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepository extends JpaRepository<Proyecto, Integer>{
    
    List<Proyecto>findAll();
    Proyecto findById(int id);      //Es necesario agregarlo para que no tire error en el ProyectoService
    Proyecto save(Proyecto pro);
    void delete(Proyecto pro);
    
}
