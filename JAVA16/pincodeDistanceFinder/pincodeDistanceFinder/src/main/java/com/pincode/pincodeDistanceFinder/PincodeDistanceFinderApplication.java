package com.pincode.pincodeDistanceFinder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class PincodeDistanceFinderApplication {

	public static void main(String[] args) {
		SpringApplication.run(PincodeDistanceFinderApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
}
