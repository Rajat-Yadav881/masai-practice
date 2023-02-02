package com.email.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.email.Model.Email;
import com.email.Model.User;
import com.email.exception.EmailException;
import com.email.exception.UserException;
import com.masai.Services.UserService;



@RestController
public class UserController {
	@Autowired
	private UserService uService;
	
	
	@GetMapping("/user")
	public ResponseEntity<List<User>> getAllUserHandler() throws UserException {

		List<User> user = uService.getAllUserDetails();

		return new ResponseEntity<List<User>>(user, HttpStatus.OK);
	}
	

	@PostMapping("/user")
	public ResponseEntity<User> registerUserHandler(@RequestBody User user) throws UserException {

		User registerdUser = uService.registerUser(user);

		return new ResponseEntity<User>(registerdUser, HttpStatus.CREATED);

	}
	
	@GetMapping("/user/{ID}")
	public ResponseEntity<User> getUserByUserIDHandler(@PathVariable("Id") Integer Id) throws UserException {

		User user = uService.getOneUserById(Id);

		return new ResponseEntity<User>(user, HttpStatus.OK);

	}
	
	@DeleteMapping("/user/{id}")
	public ResponseEntity<User> deleteUserByuserIdHandler(@PathVariable("id") Integer id) throws UserException {

		User deletedUser = uService.deleteUserById(id);

		return new ResponseEntity<User>(deletedUser, HttpStatus.OK);

	}
	
	@PutMapping("/user")
	public ResponseEntity<Email> addEmailHandler(@RequestBody Email email,Integer Id) throws UserException, EmailException {
		
	Email eddr= uService.AddEmail(email, Id);
		
		return new ResponseEntity<Email>(eddr,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/userEmail/{ID}")
	public ResponseEntity<Email> getUserEmailByUserIDHandler(@PathVariable("Id") Integer Id) throws UserException, EmailException {

		Email e = uService.getEmailByUserId(Id);

		return new ResponseEntity<Email>(e, HttpStatus.OK);

	}

}
