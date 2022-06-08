package com.crud.democrud.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "usuarioRol")
public class UsuarioRolModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private Long idUsuario;
    private Long idRol;

    
    public UsuarioRolModel() {

    }


    public void setIdRol(Long idRol) {
        this.idRol = idRol;
    }

    public UsuarioRolModel(Long id, Long idUsuario, Long idRol) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.idRol = idRol;
    }
}
