package com.miportfolio.jose.model;

import com.sun.istack.NotNull;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String nomExp;
    @NotNull
    private String descripcionExp;

    public Experiencia() {
    }

    public Experiencia(String nomExp, String descripcionExp) {
        this.nomExp = nomExp;
        this.descripcionExp = descripcionExp;
    }
    
    
}
