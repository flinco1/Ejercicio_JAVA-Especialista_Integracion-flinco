package com.test.ejercicio.utilidades;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The Class Utilidades.
 */
public class Utilidades {
	
	/**
	 * Valida dirección de correo.
	 *
	 * @param email the email
	 * @return the boolean
	 */
	public static Boolean validarEmail(String email) {
		Pattern pattern = Pattern.compile("^([0-9a-zA-Z]+[-._+&])*[0-9a-zA-Z]+@([-0-9a-zA-Z]+[.])+[a-zA-Z]{2,6}$");
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}
	
	/**
	 * Valida contrasena.
	 *
	 * @param contrasena the contrasena
	 * @param exp the exp
	 * @return the boolean
	 */
	public static Boolean validarContrasena(String contrasena, String exp) {
		Pattern pattern = Pattern.compile(exp);
		Matcher matcher = pattern.matcher(contrasena);
		return matcher.matches();
	}
	

}
