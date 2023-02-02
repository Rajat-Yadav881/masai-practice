package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Customer;
import com.masai.service.CustomerService;

@RestController
public class CustomerController {
	
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private PasswordEncoder encoder; 
	
	
	@GetMapping("/hello")
	public String testHandler() {
		return "welcome to Spring Security";
	}
	
	@PostMapping("/customers")
	public ResponseEntity<Customer> saveCustomerByEmailHandler(@RequestBody Customer customer) {
		customer.setPassword(encoder.encode(customer.getPassword()));
		Customer registerCustomer = customerService.registerCustomer(customer);
		return new ResponseEntity<>(registerCustomer,HttpStatus.ACCEPTED);
	}
	@GetMapping("/customers/{email}")
	public ResponseEntity<Customer> getCustomerByEmailHandler(@PathVariable("email")String email) {
		Customer customer = customerService.getCustomerByEmail(email);
		return new ResponseEntity<>(customer,HttpStatus.ACCEPTED);
	}
	@GetMapping("/customers")
	public ResponseEntity<List<Customer>> getAllCustomerHandler() {
		List<Customer> customers = customerService.getAllCustomerDetails();
		return new ResponseEntity<>(customers,HttpStatus.ACCEPTED);
	}
	
}
