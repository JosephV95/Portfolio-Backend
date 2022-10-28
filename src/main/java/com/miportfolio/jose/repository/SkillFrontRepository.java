
package com.miportfolio.jose.repository;

import com.miportfolio.jose.model.SkillFront;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillFrontRepository extends JpaRepository <SkillFront, Integer>{
    
    List<SkillFront>findAll();
    SkillFront findById(int id);      //Es necesario agregarlo para que no tire error en el ProyectoService
    SkillFront save(SkillFront sf);
    void delete(SkillFront sf);
    
}
