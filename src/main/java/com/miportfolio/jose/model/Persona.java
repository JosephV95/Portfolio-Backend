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
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    private String nombre;
    @NotNull
    private String apellido;
    private String email;
    private String foto_url;
    private String sobre_mi;
    private String titulo;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String email, String foto_url, String sobre_mi, String titulo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.foto_url = foto_url;
        this.sobre_mi = sobre_mi;
        this.titulo = titulo;
    }
   
    
    
    

    
    
    
    
    
}
