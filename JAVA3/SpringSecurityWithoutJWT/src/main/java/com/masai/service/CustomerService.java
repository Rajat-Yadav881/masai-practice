package com.masai.service;

import java.util.List;

import com.masai.exception.CustomerException;
import com.masai.model.Customer;

public interface CustomerService {
	public Customer registerCustomer(Customer customer);
	public Customer getCustomerByEmail(String email)throws CustomerException;
	public List<Customer>getAllCustomerDetails()throws CustomerException;
}
