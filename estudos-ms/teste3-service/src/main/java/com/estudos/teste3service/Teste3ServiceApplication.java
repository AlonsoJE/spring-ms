package com.estudos.teste3service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Teste3ServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Teste3ServiceApplication.class, args);
	}

}
