package com.example.microservices.registration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {

	public static void main(String[] args) {
		System.setProperty("spring.config.name", "eureka-server");
		SpringApplication.run(EurekaServerApplication.class, args);
	}

}
