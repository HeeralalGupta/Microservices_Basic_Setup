package com.welcome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroserviceWelcomeApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(MicroserviceWelcomeApplication.class, args);
		System.out.println("Running..");
	}

}
