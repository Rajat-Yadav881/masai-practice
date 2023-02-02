package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.CustomerException;
import com.masai.model.Customer;
import com.masai.repository.CustomerRepo;


@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerRepo repo;
	
	@Override
	public Customer registerCustomer(Customer customer) {
		
		return repo.save(customer);
	}

	@Override
	public Customer getCustomerByEmail(String email) throws CustomerException {
		
		return repo.findByEmail(email).orElseThrow(()-> new CustomerException("Customer Not Found with Email"+email));
	}

	@Override
	public List<Customer> getAllCustomerDetails() throws CustomerException {
		List<Customer> customers = repo.findAll();
		if(customers.isEmpty()) {
			throw new CustomerException("No customer Found");
		}
		return customers;
	}

}
