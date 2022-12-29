package com.masai.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.CustomerException;
import com.masai.model.Customer;
import com.masai.model.CustomerDTO;
import com.masai.repo.CustomerDAO;
@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerDAO dao;
	
	private List<Customer> listOfCustomer = new ArrayList<>();
	
	@Override
	public Customer registerCustomer(Customer customer) throws CustomerException {
		Optional<Customer> customer2 = dao.findById(customer.getCustomerId());
		
		if(customer2.isPresent()) {
			throw new CustomerException("Customer Already exist...");
		}else {
			
			listOfCustomer.add(customer);
	
			return dao.save(customer);
		}
		
	}

	@Override
	public Customer getCustomerById(Integer customerId) throws CustomerException {
		Optional<Customer> customer = dao.findById(customerId);
		if(customer.isPresent()) {
			Customer customer2 = customer.get();
			return customer2;
		}else {
			throw new CustomerException("no customer found...");
		}
		
	}

	@Override
	public Customer loginCustomer(String email, String password) throws CustomerException {
		
		for(Customer c:listOfCustomer) {
			if(c.getEmail().equals(email) && c.getPassword().equals(password)) {
				System.out.println("login successfull");
				Optional<Customer> customer = dao.findById(c.getCustomerId());
				if(customer.isPresent()) {
					Customer customer2 = customer.get();
					return customer2;
				}
			}
		}
		throw new CustomerException("no customer with this email ID");
	}

	@Override
	public Customer updateCustomerPassword(String username, String oldPassword, String newPassword)throws CustomerException {
		
		for(Customer c : listOfCustomer) {
			if(c.getCustomerName().equals(username)&& c.getPassword().equals(oldPassword)) {
				Optional<Customer> customer = dao.findById(c.getCustomerId());
				if(customer.isPresent()) {
					Customer customer2 = new Customer();
					customer2.setPassword(newPassword);
					return customer2;
				}else {
					throw new CustomerException("no valid object is available");
				}
				
			}
		}
		throw new CustomerException("invalid username and password");
	}

	@Override
	public List<Customer> getAllCustomerDetails() throws CustomerException {
		listOfCustomer = dao.findAll();
		if(listOfCustomer.isEmpty()) {
			throw new CustomerException("no customer found");
		}else {
			return listOfCustomer;
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public Customer deleteCustomerById(Integer customerId) throws CustomerException {
		Optional<Customer> customer = dao.findById(customerId);
		
		if(customer.isPresent()) {
			Customer customer2 = customer.get();
			dao.delete(customer2);
			return customer2;
		}else {
			throw new CustomerException("No customer found");
		}
		
	}

	@Override
	public List<Customer> getCustomerDetailsByAddress(String address) throws CustomerException {
		
		List<Customer> lst = dao.getTheCustomersByAddress(address);
		if(lst.isEmpty()) {
			throw new CustomerException("No customer found by address "+address);
		}else {
			return lst;
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public Customer updateCustomer(Customer customer) throws CustomerException {
		Optional<Customer> customer2 = dao.findById(customer.getCustomerId());
		if(customer2.isPresent()) {
			Customer customer3 = dao.save(customer);
			return customer3;
		}else {
			throw new CustomerException("No customer found to update");
		}
	}

	@Override
	public List<Customer> getCustomersBetweenAge(Integer start_age, Integer end_age) throws CustomerException {
		List<Customer> lst = dao.getTheCustomersBetweenAge(start_age, end_age);
		
		if(lst.isEmpty()) {
			throw new CustomerException("no customer found between the age given");
		}else {
			return lst;
		}
			
	}

	@Override
	public List<CustomerDTO> getNameAddressAgeOfAllCustomers() throws CustomerException {

		List<CustomerDTO> lst = dao.getTheNameAddressAgeOfAllCustomers();
		
		if(lst.isEmpty()) {
			throw new CustomerException("no customer found between the age given");
		}else {
			return lst;
		}
	}

}
