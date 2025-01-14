package com.alura.LiterAlura;

import com.alura.LiterAlura.principal.Principal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.*;

@SpringBootApplication
class LiteraluraApplication implements CommandLineRunner {

	@Autowired
	private final Principal principal;

	public LiteraluraApplication(Principal principal) {
		this.principal = principal;
	}

	public static void main(String[] args) {
		SpringApplication.run(LiteraluraApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		principal.mostrarMenu();
	}
}