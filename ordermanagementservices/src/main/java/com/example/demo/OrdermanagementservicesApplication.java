package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestOperations;

@SpringBootApplication
@EnableEurekaClient
public class OrdermanagementservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrdermanagementservicesApplication.class, args);
	}
	
	@Bean
	@LoadBalanced
	RestOperations restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

}
