package com.masai.service;

import java.util.List;

import com.masai.exception.CustomerException;
import com.masai.model.Customer;
import com.masai.model.CustomerDTO;

public interface CustomerService {
//	public Customer registerCustomer1(Customer customer)throws CustomerException;
	
	public Customer getCustomerById(Integer customerId)throws CustomerException;

	public Customer loginCustomer(String email, String password)throws CustomerException;
	public Customer updateCustomerPassword(String username, String oldPassword,String newPassword)throws CustomerException ;
	public List<Customer> getAllCustomerDetails()throws CustomerException;
	public Customer deleteCustomerById(Integer customerId)throws CustomerException;
	public List<Customer> getCustomerDetailsByAddress(String address)throws CustomerException;
	public Customer updateCustomer(Customer customer)throws CustomerException;
	public Customer registerCustomer(Customer Customer)throws CustomerException;
//	public Customer getCustomerById1(Integer customerId)throws CustomerException;
//	public Customer loginCustomer1(String email, String password)throws CustomerException;
//	public Customer updateCustomerPassword1(String username, String oldPassword,String newPassword)throws CustomerException ;
//	public List<Customer> getAllCustomerDetails1()throws CustomerException;
//	public Customer deleteCustomerById1(Integer customerId)throws CustomerException;
//	public List<Customer> getCustomerDetailsByAddress1(String address)throws CustomerException;
//	public Customer updateCustomer1(Customer customer)throws CustomerException;
	public List<Customer> getCustomersBetweenAge(Integer start_age,Integer end_age)throws CustomerException;
	public List<CustomerDTO> getNameAddressAgeOfAllCustomers()throws CustomerException;

}
