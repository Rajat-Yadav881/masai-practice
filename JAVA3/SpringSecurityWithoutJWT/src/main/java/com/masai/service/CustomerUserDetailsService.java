package com.masai.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.masai.model.Customer;
import com.masai.repository.CustomerRepo;

@Service
public class CustomerUserDetailsService implements UserDetailsService{
	@Autowired
	private CustomerRepo repo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Optional<Customer>opt = repo.findByEmail(username);
		if(opt.isPresent()) {
			Customer customer = opt.get();
			List<GrantedAuthority> authrities = new ArrayList<>();
			
			return new User(customer.getEmail(),customer.getPassword(),authrities);
		}else {
			throw new BadCredentialsException("user details not found with this username: "+username);
		}
		
	}

}
