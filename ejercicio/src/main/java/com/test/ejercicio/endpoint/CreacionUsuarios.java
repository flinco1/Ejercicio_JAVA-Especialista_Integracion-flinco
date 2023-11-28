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

/**
 * The Class CreacionUsuarios.
 */
@RestController
@RequestMapping(path = "/servicesREST")
public class CreacionUsuarios {
	
	/** The regex. */
	@Value(value = "${validaciones.regex.contrsena}")
	private String regex;
	
	/** The usuario service. */
	@Autowired
	private IUsuarioService usuarioService;
	
	/**
	 * Creacion usuarios.
	 *
	 * @param userRequest the user request
	 * @return the response entity
	 * @throws Exception the exception
	 */
	@PostMapping( path = "/creacionUsuarios")
	public ResponseEntity<?> creacionUsuarios(@RequestBody UserRequest userRequest) throws Exception {

		UserResponse userResponse;
		
		try {
			// Validación del email
			if(!Utilidades.validarEmail(userRequest.getEmail())) {
				ErrorRequest error = new ErrorRequest();
				error.setMensaje("El correo no tiene el formato correcto.");
				return ResponseEntity.ok(error);
			
			}
			//Validación del formato de la contraseña
			else if(!Utilidades.validarContrasena(userRequest.getPassword(), regex)) {
				
				ErrorRequest error = new ErrorRequest();
				error.setMensaje("El contraseña no cumple con el formato solicitado.");
				return ResponseEntity.ok(error);
			}
			//Creación del usuarios
			else if(usuarioService.validarUsuario(userRequest)) {
				userResponse = usuarioService.crearUsuario(userRequest);
				return ResponseEntity.ok(userResponse);
			} 
			//En el caso que el usuario exista, se enviar el mensaje informado.
			else {
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
