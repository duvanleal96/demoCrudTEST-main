package com.crud.democrud.repositories;

import com.crud.democrud.models.UsuarioRolModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;

public interface UsuarioRolRepository extends CrudRepository<UsuarioRolModel, Long> {

}

