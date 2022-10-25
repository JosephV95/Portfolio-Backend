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
public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank
    private String nomEdu;
    @NotBlank
    private String instEdu;
    @NotBlank
    private String aniosEdu;
    @NotBlank
    private String descEdu;

    public Educacion() {
    }

    public Educacion(String nomEdu, String instEdu, String aniosEdu, String descEdu) {
        this.nomEdu = nomEdu;
        this.instEdu = instEdu;
        this.aniosEdu = aniosEdu;
        this.descEdu = descEdu;
    }

    
    
    
    
    
}
