package com.abhi.microservices.ratingsdateservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RatingsDateServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RatingsDateServiceApplication.class, args);
	}

}
