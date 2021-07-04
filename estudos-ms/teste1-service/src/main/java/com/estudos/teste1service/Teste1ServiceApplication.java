package com.estudos.teste1service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient //Habilita esta aplicação como uma instancia/cliente identificavel do EurekaServer
@EnableFeignClients //Habilita o uso do OpenFeign dentro desta aplicação
public class Teste1ServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Teste1ServiceApplication.class, args);}

	@Bean //Torna o restTemplate um bean gerenciavel e injetavel do spring
	@LoadBalanced //Insere o balanceador de carga no restTemplate, tornando possível seu reconhecimento e uso
	RestTemplate restTemplate(){
		return new RestTemplate();
	}

}
