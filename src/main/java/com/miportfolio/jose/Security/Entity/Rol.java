package com.miportfolio.jose.Security.Entity;

import com.miportfolio.jose.Security.Enums.RolNombre;
import com.sun.istack.NotNull;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull        //los cambie a not null pero habia puesto NotBlank
    @Enumerated(EnumType.STRING)   //Esto define que el tipo de dato que debe ingresar sea string
    private RolNombre rolNombre;

    public Rol() {
    }
    // No necesito generar el id en el constructor porque se autogenera con el IDENTITY//
    public Rol(RolNombre rolNombre) {
        this.rolNombre = rolNombre;
    }
    
    //Getter y Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RolNombre getRolNombre() {
        return rolNombre;
    }

    public void setRolNombre(RolNombre rolNombre) {
        this.rolNombre = rolNombre;
    }
    
    
    
}
