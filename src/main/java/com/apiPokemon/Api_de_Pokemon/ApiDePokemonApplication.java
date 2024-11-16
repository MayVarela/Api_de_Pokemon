package com.apiPokemon.Api_de_Pokemon;

import com.apiPokemon.Api_de_Pokemon.Principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiDePokemonApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ApiDePokemonApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.muestraMenu();
	}
}
