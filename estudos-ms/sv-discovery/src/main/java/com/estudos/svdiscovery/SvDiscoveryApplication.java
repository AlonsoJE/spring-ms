package com.estudos.svdiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SvDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SvDiscoveryApplication.class, args);
	}

}
