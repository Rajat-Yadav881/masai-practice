package com.masai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.masai.exception.CustomerException;
import com.masai.model.Customer;
import com.masai.model.CustomerDTO;

@Repository
public interface CustomerDao extends JpaRepository<Customer, Integer>{
	
	@Query("select c from Customer c where c.address = ?1")
	public List<Customer> findByAddress(String address) throws CustomerException;
//	@Query("select s.name from Student s where s.roll = :r") //named PlacedHolder
//	public String getStudentNameByRoll(@Param("r") Integer roll);
	@Query("select c from Customer c where c.age between :s and :e")
	public List<Customer> getTheCustomersBetweenAge(@Param("s") Integer start_age,@Param("e") Integer end_age) throws CustomerException;
	
	@Query("select new com.masai.model.CustomerDTO(c.name,c.address,c.age) from Customer c")
	public List<CustomerDTO>getNameAddressAgeOfAllCustomers1()throws CustomerException;
}
