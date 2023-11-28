package com.test.ejercicio.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.ejercicio.dto.ErrorRequest;
import com.test.ejercicio.dto.UserRequest;
import com.test.ejercicio.dto.UserResponse;
import com.test.ejercicio.service.IUsuarioService;
import com.test.ejercicio.utilidades.Utilidades;

@RestController
@RequestMapping(path = "/servicesREST")
public class CreacionUsuarios {
	
	@Value(value = "${validaciones.regex.contrsena}")
	private String regex;
	
	@Autowired
	private IUsuarioService usuarioService;
	
	@PostMapping( path = "/creacionUsuarios")
	public ResponseEntity<?> creacionUsuarios(@RequestBody UserRequest userRequest) throws Exception {

		System.out.println("User: " + userRequest.getName());
		System.out.println("email: " + userRequest.getEmail());
		
		UserResponse userResponse;
		
		try {
			if(!Utilidades.validarEmail(userRequest.getEmail())) {
				ErrorRequest error = new ErrorRequest();
				error.setMensaje("El correo no tiene el formato correcto.");
				return ResponseEntity.ok(error);
			} if(!Utilidades.validarContrasena(userRequest.getPassword(), regex)) {
				ErrorRequest error = new ErrorRequest();
				error.setMensaje("El contraseña no cumple con el formato solicitado.");
				return ResponseEntity.ok(error);
			}else if(usuarioService.validarUsuario(userRequest)) {
				userResponse = usuarioService.crearUsuario(userRequest);
				return ResponseEntity.ok(userResponse);
			} else {
				ErrorRequest error = new ErrorRequest();
				error.setMensaje("El correo ya registrado");
				return ResponseEntity.ok(error);
			}
		} catch (Exception ex) {
			ErrorRequest error = new ErrorRequest();
			error.setMensaje("Error Interno");
			return ResponseEntity.ok(error);
		}
	}
	


	
}
