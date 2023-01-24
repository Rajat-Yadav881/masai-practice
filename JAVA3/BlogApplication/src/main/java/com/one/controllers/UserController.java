package com.one.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.one.payload.ApiResponse;
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
	
	@PutMapping("/{userId}")
	public ResponseEntity<UserDto> updateUser(@RequestBody UserDto userDto,@PathVariable("UserId")Integer userId){
		UserDto updateUser = this.service.updateUser(userDto, userId); 
		return new ResponseEntity<>(updateUser,HttpStatus.CREATED);
	}
	//DELETE
	@DeleteMapping("/{userId}")
	public ResponseEntity<ApiResponse>deleteUser(@PathVariable("userId") Integer uid){
		this.service.deleteUser(uid);
		return new ResponseEntity<ApiResponse>(new ApiResponse("user deleted Successfully",true),HttpStatus.OK);
	}
	//GET
	@GetMapping("/")
	public ResponseEntity<List<UserDto>> getAllUsers(){
		return ResponseEntity.ok(this.service.getAllUsers());
	}
	
	
	//GET
	@GetMapping("/{userId}")
	public ResponseEntity<UserDto> getSingleUser(@PathVariable Integer userId){
		return ResponseEntity.ok(this.service.getUserById(userId));
	}
	
}
