package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.neo4j.Neo4jProperties.Authentication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Customer;
import com.masai.repository.CustomerRepo;

@RestController
public class LoginController {
	
	@Autowired
	private CustomerRepo customerRepo;
	
	
	@GetMapping("signIn")
	public ResponseEntity<Customer> getLoggedIntCustomerDetailsHandler(Authentication auth){
		System.out.println(auth);
		Customer customer = customerRepo.findByEmail(auth.getUsername()).orElseThrow(()-> new BadCredentialsException(null));
		
		return new ResponseEntity<>(customer,HttpStatus.ACCEPTED);
	}
}
