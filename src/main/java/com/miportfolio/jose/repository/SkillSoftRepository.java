
package com.miportfolio.jose.repository;

import com.miportfolio.jose.model.SkillSoft;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillSoftRepository extends JpaRepository<SkillSoft, Integer> {
    
    List<SkillSoft>findAll();
    SkillSoft findById(int id);      //Es necesario agregarlo para que no tire error en el ProyectoService
    SkillSoft save(SkillSoft ss);
    void delete(SkillSoft ss);
    
}
