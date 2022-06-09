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

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public Long getIdUsuario() {
            return idUsuario;
        }

        public void setIdUsuario(Long idUsuario) {
            this.idUsuario = idUsuario;
        }

        public String getIdRol() {
            return idRol;
        }

        private String idRol;


    public UsuarioRolModel() {

    }


    public void setIdRol(String idRol) {
        this.idRol = idRol;
    }

    public UsuarioRolModel(Long id, Long idUsuario, String idRol) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.idRol = idRol;
    }
}
