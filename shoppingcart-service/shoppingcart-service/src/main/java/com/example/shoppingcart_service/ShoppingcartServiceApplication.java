package com.example.shoppingcart_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ShoppingcartServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingcartServiceApplication.class, args);
	}

	@Bean("webclient")
	@LoadBalanced
	public WebClient.Builder getWebClient(){
		return WebClient.builder();
	}
}
