package com.crud.democrud.ServicesTest;

import com.crud.democrud.models.UsuarioRolModel;
import com.crud.democrud.repositories.UsuarioRolRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UsuarioRolServiceTest {
    @Autowired
    UsuarioRolRepository usuarioRolRepository;

    @Test
    public void testGuardarUsuario(){
        UsuarioRolModel usuarioRolModel=new UsuarioRolModel(1L,1L,"tigre");
        UsuarioRolModel usuarioModelRegistrado = usuarioRolRepository.save(usuarioRolModel);
        assertNotNull(usuarioModelRegistrado);
    }

    @Test
    public void testBuscarUsuarioPorId(){
        Long idBuscado=1L;
        Optional<UsuarioRolModel> usuarioModelBuscado=usuarioRolRepository.findById(idBuscado);
        assertThat(usuarioModelBuscado.get().getId()).isEqualTo(idBuscado);
    }

    @Test
    public void testListarUsuarios(){
        List<UsuarioRolModel> usuarioModelList=(List<UsuarioRolModel>) usuarioRolRepository.findAll();
        assertThat(usuarioModelList).size().isGreaterThan(0);
    }
}
