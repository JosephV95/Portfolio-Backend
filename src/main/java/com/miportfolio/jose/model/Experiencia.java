package com.miportfolio.jose.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
@Entity
public class Experiencia {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @NotBlank   //con NotBlank se impide que se envie este campo vacio
    @Column(name="nomExp")
    private String nomExp;
    @NotBlank
    @Column(name="aniosExp")
    private String aniosExp;
    @NotBlank
    @Column(name="descripcionExp")
    private String descripcionExp;

    public Experiencia() {
    }

    public Experiencia(String nomExp, String aniosExp, String descripcionExp) {
        this.nomExp = nomExp;
        this.aniosExp = aniosExp;
        this.descripcionExp = descripcionExp;
    }

    
    
    
    
}
