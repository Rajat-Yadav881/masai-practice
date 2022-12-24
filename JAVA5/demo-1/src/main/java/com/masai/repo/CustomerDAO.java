package com.masai.repo;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.masai.model.Customer;
import com.masai.model.CustomerDTO;
@Repository
public interface CustomerDAO extends JpaRepository<Customer, Integer>{
	
	@Query("select c from Customer c where c.address = ?1")
	public List<Customer> getTheCustomersByAddress(String address);
	
	@Query("select c from Customer c where c.age between ?1 and ?2")
	public List<Customer> getTheCustomersBetweenAge(Integer start_age, Integer end_age);
	
//	@Query("select c from Customer c where c.email = ?1 and c.password = ?2")
//	public Customer getloginCustomer(String email, String password);
	
	@Query("select new com.masai.model.CustomerDTO(c.customerName,c.address,c.age)from Customer c ")
	public List<CustomerDTO> getTheNameAddressAgeOfAllCustomers();
	

}
