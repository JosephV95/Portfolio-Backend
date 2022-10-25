package com.miportfolio.jose.repository;


import com.miportfolio.jose.model.Experiencia;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepository extends JpaRepository<Experiencia, Integer>{
    
    List<Experiencia>findAll();
    Experiencia findById(int id);
    Experiencia save(Experiencia exp);
    void delete(Experiencia exp);
    
}
