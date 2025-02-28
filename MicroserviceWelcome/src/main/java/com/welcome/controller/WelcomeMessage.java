package com.welcome.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeMessage {
	
	@Autowired
	private Environment env;
	
	@Value("${msg}")
	private String myMsg;
	
	@GetMapping("/welcome")
	public String welcomeMsg() {
		return "Welcome to microservice api : ("+ env.getProperty("server.port") + ")" + "Our message : " + myMsg;
	}
	
}
