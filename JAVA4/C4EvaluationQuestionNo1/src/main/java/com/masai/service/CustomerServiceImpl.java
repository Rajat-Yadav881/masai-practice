package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.CustomerException;
//import com.masai.exception.StudentException;
//import com.masai.exception.StudentException;
import com.masai.model.Customer;
import com.masai.model.CustomerDTO;
//import com.masai.model.Student;
//import com.masai.model.Student;
import com.masai.repository.CustomerDao;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerDao dao;

	@Override
	public Customer registerCustomer(Customer customer) throws CustomerException {
		Customer saveCustomer = dao.save(customer);
		
		return saveCustomer;
	}

	@Override
	public Customer getCustomerById(Integer customerId) throws CustomerException {
		return dao.findById(customerId).orElseThrow(() -> new CustomerException("no customer found ..."));
	}

	@Override
	public Customer loginCustomer(String email, String password) throws CustomerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer updateCustomerPassword(String username, String oldPassword, String newPassword)
			throws CustomerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getAllCustomerDetails() throws CustomerException {
		List<Customer> list = dao.findAll();
		if(list.size()==0) {
			throw new CustomerException("the list is empty");
		}else
			return list;
	}

	@Override
	public Customer deleteCustomerById(Integer customerId) throws CustomerException {
		Optional<Customer> opt = dao.findById(customerId);
		
		if (opt.isPresent()) {

			Customer existingCustomer = opt.get();

			dao.delete(existingCustomer);

			return existingCustomer;

		} else
			throw new CustomerException("customer does not exist with customer ID :" + customerId);

	}

	@Override
	public List<Customer> getCustomerDetailsByAddress(String address) throws CustomerException {
		List<Customer> optional = dao.findByAddress(address);
		
		if(optional.isEmpty()) {
			throw new CustomerException("no list found on this address");
		}else
			return optional;
	}

	@Override
	public Customer updateCustomer(Customer customer) throws CustomerException {
	
		Optional<Customer> opt= dao.findById(customer.getCustomerId());
		
		if(opt.isPresent()) {
			
			//this save method perform 2 operation 1. insert 2 merge
			Customer updatedCustomer= dao.save(customer);
			
			return updatedCustomer;
			
			
		}else
			throw new CustomerException("Invalid Customer details..");
		
	}

	@Override
	public List<Customer> getCustomersBetweenAge(Integer start_age, Integer end_age) throws CustomerException {
		List<Customer> optional = dao.getTheCustomersBetweenAge(start_age, end_age);
		
		if(optional.isEmpty()) {
			throw new CustomerException("no customer found in the list");
		}else {
			return optional;
		}
	}

	@Override
	public List<CustomerDTO> getNameAddressAgeOfAllCustomers() throws CustomerException {
		List<CustomerDTO> customerDTOs = dao.getNameAddressAgeOfAllCustomers1();
		
		if(customerDTOs.isEmpty()) {
			throw new CustomerException("not customer found");
		}else {
			return customerDTOs;
		}
	}





	

	
	

}
