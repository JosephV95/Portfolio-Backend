
package com.miportfolio.jose.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class SkillBack {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank
    private String nomSkillB;
    @NotBlank
    private String icoSkillB;
    @NotBlank 
    private String porcSkillB;

    public SkillBack() {
    }

    public SkillBack(String nomSkillB, String icoSkillB, String porcSkillB) {
        this.nomSkillB = nomSkillB;
        this.icoSkillB = icoSkillB;
        this.porcSkillB = porcSkillB;
    }
    
    
}
