package com.miportfolio.jose.repository;


import com.miportfolio.jose.model.Persona;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository <Persona, Integer>{
    
    List<Persona>findAll();
    Persona findById(int id);      
    Persona save(Persona per);
    void delete(Persona per);
}
