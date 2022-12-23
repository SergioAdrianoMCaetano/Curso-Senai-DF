package com.adriano.sergio.senai.primeiroprojetospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//BEANS: SÃO ANOTAÇÕES NECESSÁRIAS PARA O FUNCIONAMENTO DO SPRING BOOT
@SpringBootApplication  //ANOTAÇÕES SÃO CHAMADAS DE BEAN NO SPRING-BOOT SÃO NECESSÁRIAS PARA O FUNCIONAMENTO DO SPRING-BOOT;
public class PrimeiroProjetoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeiroProjetoSpringApplication.class, args);
	}



}
