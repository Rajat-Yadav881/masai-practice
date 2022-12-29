package com.masai.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.CustomerException;
import com.masai.model.Customer;
import com.masai.model.CustomerDTO;
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
	
	@GetMapping("/customer")
	public ResponseEntity<Customer> getCustomerByIdHandler(@Valid @RequestParam Integer customerId)throws CustomerException{
		Customer customer2 = cus.getCustomerById(customerId);
		
		return new ResponseEntity<Customer>(customer2,HttpStatus.OK);
	}
	@GetMapping("/Allcustomer")
	public ResponseEntity<List<Customer>> getAllCustomerDetailsHandler()throws CustomerException{
		List<Customer> customers = cus.getAllCustomerDetails();
		
		return new ResponseEntity<List<Customer>>(customers,HttpStatus.OK);
	}
	@DeleteMapping("/customer")
	public ResponseEntity<Customer> deleteCustomerByIdHandler(@Valid @RequestParam Integer customerId)throws CustomerException{
		Customer customer2 = cus.deleteCustomerById(customerId);
		
		return new ResponseEntity<Customer>(customer2,HttpStatus.OK);
	}
	
	@PutMapping("/customer")
	public ResponseEntity<Customer> updateCustomerHandler(@Valid @RequestBody Customer customer)throws CustomerException{
		Customer customer2 = cus.updateCustomer(customer);
		
		return new ResponseEntity<Customer>(customer2,HttpStatus.OK);
	}
	
	@GetMapping("/AllcustomerByAddress")
	public ResponseEntity<List<Customer>> getTheCustomersByAddressHandler(@Valid @RequestParam String address)throws CustomerException{
		List<Customer> customers = cus.getCustomerDetailsByAddress(address);
		
		return new ResponseEntity<List<Customer>>(customers,HttpStatus.OK);
	}
	
	@GetMapping("/AllcustomerBetweenAge")
	public ResponseEntity<List<Customer>> getTheCustomersBetweenAgeHandler(@Valid @RequestParam Integer start_age,@Valid @RequestParam Integer end_age)throws CustomerException{
		List<Customer> customers = cus.getCustomersBetweenAge(start_age,end_age);
		
		return new ResponseEntity<List<Customer>>(customers,HttpStatus.OK);
	}
	
	@GetMapping("/AllcustomerDTO")
	public ResponseEntity<List<CustomerDTO>> getNameAddressAgeOfAllCustomersHandler()throws CustomerException{
		List<CustomerDTO> Dto = cus.getNameAddressAgeOfAllCustomers();
		
		return new ResponseEntity<List<CustomerDTO>>(Dto,HttpStatus.OK);
	}
	
	@PostMapping("/loginCustomer")
	public ResponseEntity<Customer> CustomerLoginHandler(@Valid @RequestParam String email,@Valid @RequestParam String password)throws CustomerException{
		Customer Dto = cus.loginCustomer(email,password);
		
		return new ResponseEntity<Customer>(Dto,HttpStatus.OK);
	}
	
	@PostMapping("/updateCustomerPassword")
	public ResponseEntity<Customer> updatePasswordHandler(@Valid @RequestParam String username,@Valid @RequestParam String oldPassword,@Valid @RequestParam String newPassword)throws CustomerException{
		Customer Dto = cus.updateCustomerPassword(username, oldPassword, newPassword);
		
		return new ResponseEntity<Customer>(Dto,HttpStatus.OK);
	}
	
}
