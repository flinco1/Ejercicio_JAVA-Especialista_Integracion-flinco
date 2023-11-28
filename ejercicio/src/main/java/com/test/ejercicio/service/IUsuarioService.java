package com.test.ejercicio.service;

import com.test.ejercicio.dto.UserRequest;
import com.test.ejercicio.dto.UserResponse;

public interface IUsuarioService {
	
	Boolean validarUsuario(UserRequest userRequest);
	
	UserResponse crearUsuario(UserRequest userRequest);

}