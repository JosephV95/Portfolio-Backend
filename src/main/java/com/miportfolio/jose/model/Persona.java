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
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @NotBlank
    private String nombre;
    @NotBlank
    private String apellido;
    private String titulo;
    private String foto_url;
    private String fondo_url;
    private String sobre_mi;
    

    public Persona() {
    }

    public Persona(String nombre, String apellido, String titulo, String foto_url, String fondo_url, String sobre_mi) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.foto_url = foto_url;
        this.fondo_url = fondo_url;
        this.sobre_mi = sobre_mi;
    }

    
   
    
    
    

    
    
    
    
    
}
