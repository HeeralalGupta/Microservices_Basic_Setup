package com.greeting.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greeting.service.ApiCommunication;

@RestController
public class GreetController {
	
	@Autowired
	private ApiCommunication apiComm;
	
	@GetMapping("/greeting")
	public String greeting() {
		UUID uuid = UUID.randomUUID();
		System.out.println(uuid.toString());
		String welcomeData = apiComm.invokeWelocomeApi();
		return "Output from Greeting Service : Good morning , "+ "Output from Welcome Service : "+welcomeData + uuid.toString();
	}

}
