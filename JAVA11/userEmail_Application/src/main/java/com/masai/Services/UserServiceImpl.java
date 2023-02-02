package com.masai.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Model.Email;
import com.masai.Model.User;
import com.masai.Repository.EmailDAO;
import com.masai.Repository.UserDAO;
import com.masai.exception.EmailException;
import com.masai.exception.UserException;


@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDAO udao;
	@Autowired
	private EmailDAO erepo; 

	@Override
	public List<User> getAllUserDetails() throws UserException {
		List<User> user=udao.findAll();
		if(user.size()==0) {
			throw new UserException("user not found");
		}else {
			return user;
		}
	}

	@Override
	public User registerUser(User user) throws UserException {
		User savedUser=udao.save(user);
		return savedUser;
	}

	@Override
	public User getOneUserById(Integer Id) throws UserException {
		return udao.findById(Id).orElseThrow(()-> new UserException("User not found by user ID "+ Id));
	}

	@Override
	public User deleteUserById(Integer Id) throws UserException {
		Optional<User> opt= udao.findById(Id);

		if (opt.isPresent()) {

			User existingUser = opt.get();

			udao.delete(existingUser);

			return existingUser;

		} else
			throw new UserException("customer does not exist with customer :" + Id);
	}

	@Override
	public Email AddEmail(Email email, Integer Id) throws UserException, EmailException {
		// TODO Auto-generated method stub
		Optional<User> opt= udao.findById(Id);
		if(opt.isPresent()) {
			User uust= opt.get();
			 
			 uust.setEmail(email);
			 
//			 crepo.save(cust);
			 
			 Email eddr= erepo.save(email);
			 
			 return eddr;
			 
			
		}else {
			throw new UserException("Invalid User Id");
	}}

	@Override
	public Email getEmailByUserId(Integer Id) throws UserException, EmailException {
		// TODO Auto-generated method stub
		Optional<User> opt= udao.findById(Id);
		if(opt.isPresent()) {
			User uust= opt.get();
			Email e=uust.getEmail();
			return e;
		}else {
			throw new UserException("Invalid User Id");
	}
	}

}
