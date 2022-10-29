
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
public class SkillSoft {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank
    private String nomSkillS;
    @NotBlank
    private String icoSkillS;

    public SkillSoft() {
    }

    public SkillSoft(String nomSkillS, String icoSkillS) {
        this.nomSkillS = nomSkillS;
        this.icoSkillS = icoSkillS;
    }
    
    
    
}
