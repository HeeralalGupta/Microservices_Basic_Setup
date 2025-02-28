package com.apigateway.filter;

import java.util.List;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

@Component
public class APIFilter implements GlobalFilter{

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		
		 ServerHttpRequest request = exchange.getRequest(); // Getting the request from user
		 HttpHeaders headers = request.getHeaders(); // Get the header form request
		 
		 // We are authenticating the request which is coming from user
		 if (!headers.containsKey("token")) {
		     throw new RuntimeException("Invalid Request");
		 }

		 List<String> list = headers.get("token");
		 if (list == null || list.isEmpty() || !list.get(0).equals("heera@123")) {
		     throw new RuntimeException("Invalid Token");
		 }
		 // Based on the above condition will rout the request
		 return chain.filter(exchange); // Continue request processing
		
	}

	
	
}
