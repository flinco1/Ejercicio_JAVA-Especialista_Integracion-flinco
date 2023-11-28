package com.test.ejercicio.service;

import com.test.ejercicio.dto.UserRequest;
import com.test.ejercicio.dto.UserResponse;

/**
 * The Interface IUsuarioService.
 */
public interface IUsuarioService {
	
	/**
	 * Validar usuario.
	 *
	 * @param userRequest the user request
	 * @return the boolean
	 */
	Boolean validarUsuario(UserRequest userRequest);
	
	/**
	 * Crear usuario.
	 *
	 * @param userRequest the user request
	 * @return the user response
	 */
	UserResponse crearUsuario(UserRequest userRequest);

}