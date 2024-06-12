package com.example.jwt_validator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class JwtValidatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtValidatorApplication.class, args);
	}

}
