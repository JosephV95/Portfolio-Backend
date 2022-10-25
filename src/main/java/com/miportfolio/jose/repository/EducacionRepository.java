
package com.miportfolio.jose.repository;

import com.miportfolio.jose.model.Educacion;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepository extends JpaRepository <Educacion, Integer>{
    
    List<Educacion>findAll();
    Educacion findById(int id);
    Educacion save(Educacion exp);
    void delete(Educacion exp);
}
