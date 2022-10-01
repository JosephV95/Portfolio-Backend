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
public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String nomInst;
    @NotNull
    private String grado;
    @NotNull
    private String titulo;

    public Educacion() {
    }

    public Educacion(String nomInst, String grado, String titulo) {
        this.nomInst = nomInst;
        this.grado = grado;
        this.titulo = titulo;
    }
    
    
    
    
}
