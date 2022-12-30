package com.spring.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/masai")
public class WelcomeController {
	
	//this should not be protected
	@GetMapping("/welcome")
	public ResponseEntity<String>welcome(){
		return new ResponseEntity<String>("Welcome to masai App without security",HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/welcomeP")
	public ResponseEntity<String> welcomeP(){
		
		return new ResponseEntity<String>("Welcome to Masai App with Security",HttpStatus.ACCEPTED);
	}
}
