package com.test.ejercicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * The Class EjercicioApplication.
 */
@EnableWebMvc
@SpringBootApplication
@EnableSwagger2
public class EjercicioApplication {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(EjercicioApplication.class, args);
	}

}
