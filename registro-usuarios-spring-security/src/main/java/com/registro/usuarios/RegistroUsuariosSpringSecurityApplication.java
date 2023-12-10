package com.registro.usuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.validation.annotation.Validated;

/**
 * 
 * @author aleja
 */

@SpringBootApplication
@Validated
public class RegistroUsuariosSpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistroUsuariosSpringSecurityApplication.class, args);
	}

}
