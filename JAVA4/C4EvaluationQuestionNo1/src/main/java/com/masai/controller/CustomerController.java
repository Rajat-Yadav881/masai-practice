package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Customer;
import com.masai.model.CustomerDTO;
//import com.masai.model.Student;
import com.masai.service.CustomerService;
@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	@PostMapping("/customers")
	public ResponseEntity<Customer> registerStudentHandler(@RequestBody Customer customer){
		
		
		Customer registerdCustomer= service.registerCustomer(customer);
		
		return new ResponseEntity<Customer>(registerdCustomer, HttpStatus.CREATED);
		
	}
	
	@GetMapping("/customers/{id}")
	public ResponseEntity<Customer> getCustomerByIdHandler(@PathVariable("id") Integer customerId){
		
		
		Customer rCustomer= service.getCustomerById(customerId);
		
		return new ResponseEntity<Customer>(rCustomer, HttpStatus.OK);
		
	}
	
	@GetMapping("/customers")
	public ResponseEntity<List<Customer>> getAllCustomerdelHandler(){
		
		List<Customer> customers= service.getAllCustomerDetails();
		
		
		return new ResponseEntity<List<Customer>>(customers,HttpStatus.OK);
	}

	@DeleteMapping("/customers/{id}")
	public ResponseEntity<Customer> deleteCustomerByIdHandler(@PathVariable("id") Integer customerId){
		
		
		Customer rCustomer= service.deleteCustomerById(customerId);
		
		return new ResponseEntity<Customer>(rCustomer, HttpStatus.OK);
		
	}
	
	@GetMapping("/customerszX/address")
	public ResponseEntity<List<Customer>> getCustomerDetailsByAddressHandler(@PathVariable("address") String address){
		
		List<Customer> customers= service.getCustomerDetailsByAddress(address);
		
		
		return new ResponseEntity<List<Customer>>(customers,HttpStatus.OK);
	}
	@PutMapping("/customers")
	public ResponseEntity<Customer> UpdateCustomerHandler(@RequestBody Customer customer){
		
		
		Customer rCustomer= service.updateCustomer(customer);
		
		return new ResponseEntity<Customer>(rCustomer, HttpStatus.OK);
		
	}
	
	@GetMapping("/customerszX/st/en")
	public ResponseEntity<List<Customer>> getCustomersBetweenAgeHandler(@PathVariable("st") Integer start_age,@PathVariable("en") Integer end_age){
		
		List<Customer> customers= service.getCustomersBetweenAge(start_age,end_age);
		
		
		return new ResponseEntity<List<Customer>>(customers,HttpStatus.OK);
	}
	
	@GetMapping("/customerDTO")
	public ResponseEntity<List<CustomerDTO>> getNameAddressAgeOfAllCustomersHandler(){
		
		List<CustomerDTO> customers= service.getNameAddressAgeOfAllCustomers();
		
		
		return new ResponseEntity<List<CustomerDTO>>(customers,HttpStatus.OK);
	}
}
