package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping ("hello-world")
public class HelloWorldController {
	
	@GetMapping 
	public String helloworld() {
		return "Hello World!!";
	}
	
	@GetMapping ("/lista-bsm")
	public String listabsm() {
		return "Orientação ao Futuro"
				+ "Responsabilidade Pessoal, Mentalidade de Crescimento, PersistênciaTrabalho em Equipe, Atenção aos Detalhes, Proatividade, Comunicação.";
	}
	
	@GetMapping ("/lista-objetivos")
	public String listaobjetivo() {
		return "Terminar minha apresentação, Melhorar meu GitHub, Aprender Spring.";
	}

}


