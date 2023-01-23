package com.one.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.one.payload.UserDto;
import com.one.services.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
	private UserService service;
	//POST
	@PostMapping("/")
	public ResponseEntity<UserDto> createUser(@RequestBody UserDto dto){
		UserDto createUserDto = this.service.createUser(dto);
		return new ResponseEntity<>(createUserDto,HttpStatus.CREATED);
	}
	//PUT
	//DELETE
	//GET
}
