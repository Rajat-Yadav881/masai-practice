package com.masai.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.CustomerException;
import com.masai.model.Customer;
import com.masai.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	
	@Autowired
	private CustomerService cus;
	
	@PostMapping("/customer")
	public ResponseEntity<Customer> registerCustomerHandler(@Valid @RequestBody Customer customer)throws CustomerException{
		Customer customer2 = cus.registerCustomer(customer);
		
		return new ResponseEntity<Customer>(customer2,HttpStatus.CREATED);
	}
	
}
