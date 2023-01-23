package com.masai;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Welcome to the Spring Security";
	}
	
	@GetMapping("/hello2")
	public String sayHello2() {
		return "Welcome to the Spring Security 2.0";
	}
}
