package com.greeting.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "WELCOME-MICROSERVICE")
public interface ApiCommunication {
	
	@GetMapping("/welcome")
	public String invokeWelocomeApi();
	
}
