package com.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ServerConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerConfigApplication.class, args);
		System.out.println("Running..");
	}

}
