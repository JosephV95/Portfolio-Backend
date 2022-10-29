
package com.miportfolio.jose.repository;

import com.miportfolio.jose.model.SkillBack;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillBackRepository extends JpaRepository<SkillBack, Integer>{
    
    List<SkillBack>findAll();
    SkillBack findById(int id);      //Es necesario agregarlo para que no tire error en el ProyectoService
    SkillBack save(SkillBack sb);
    void delete(SkillBack sb);
}
