
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
public class SkillFront {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank
    private String nomSkillF;
    @NotBlank
    private String icoSkillF;
    @NotBlank 
    private String porcSkillF;

    public SkillFront() {
    }

    public SkillFront(String nomSkillF, String icoSkillF, String porcSkillF) {
        this.nomSkillF = nomSkillF;
        this.icoSkillF = icoSkillF;
        this.porcSkillF = porcSkillF;
    }
    
    
    
}
