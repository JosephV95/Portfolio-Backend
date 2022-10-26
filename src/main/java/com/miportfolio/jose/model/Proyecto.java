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
public class Proyecto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank
    private String nomPro;
    @NotBlank
    private String descPro;
    @NotBlank
    private String linkPro;
    @NotBlank
    private String fotoPro;

    public Proyecto() {
    }

    public Proyecto(String nomPro, String descPro, String linkPro, String fotoPro) {
        this.nomPro = nomPro;
        this.descPro = descPro;
        this.linkPro = linkPro;
        this.fotoPro = fotoPro;
    }
    
    
    
    
}
