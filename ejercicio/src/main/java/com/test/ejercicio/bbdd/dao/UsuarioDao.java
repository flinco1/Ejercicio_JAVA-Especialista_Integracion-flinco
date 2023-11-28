package com.test.ejercicio.bbdd.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.test.ejercicio.bbdd.entidades.Usuario;

@Repository
public interface UsuarioDao extends CrudRepository<Usuario, Integer>  {

	List<Usuario> findByEmail(String email);
}
