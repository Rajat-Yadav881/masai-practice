package com.mock.service;

import java.util.List;

import com.mock.exception.EmailException;
import com.mock.exception.UserException;
import com.mock.model.Email;
import com.mock.model.User;

public interface UserService {
	public List<User> getAllUser() throws UserException;
	
	public User createUser(User user)throws UserException;
	
	public User GetUser(long id)throws UserException;
	
	public User deleteUser(long id)throws UserException;
	
	public Email userEmail(User user)throws UserException,EmailException;
	
	public Email createEmail(Email email)throws EmailException,UserException;
	
	
}
