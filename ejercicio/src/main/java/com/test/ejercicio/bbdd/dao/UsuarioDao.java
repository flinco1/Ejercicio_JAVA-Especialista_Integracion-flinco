package com.test.ejercicio.bbdd.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.test.ejercicio.bbdd.entidades.Usuario;

/**
 * The Interface UsuarioDao.
 */
@Repository
public interface UsuarioDao extends CrudRepository<Usuario, Integer>  {

	/**
	 * Find by email.
	 *
	 * @param email the email
	 * @return the list
	 */
	List<Usuario> findByEmail(String email);
}
