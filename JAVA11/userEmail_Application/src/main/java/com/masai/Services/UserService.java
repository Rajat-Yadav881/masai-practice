package com.masai.Services;

import java.util.List;

import com.masai.Model.Email;
import com.masai.Model.User;
import com.masai.exception.EmailException;
import com.masai.exception.UserException;

public interface UserService {
	public List<User> getAllUserDetails()throws UserException;
	
	public User registerUser(User user)throws UserException;
	
	public User getOneUserById(Integer Id)throws UserException;
	
	public User deleteUserById(Integer Id)throws UserException;
	
	public Email AddEmail(Email email,Integer Id)throws UserException,EmailException;
	
	public Email getEmailByUserId(Integer Id)throws UserException,EmailException;

}
