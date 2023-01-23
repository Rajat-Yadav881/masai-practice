package com.one.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.one.entity.User;
import com.one.payload.UserDto;
import com.one.repo.UserRepo;
import com.one.services.UserService;
import com.one.exception.*;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepo repo;
	

	@Override
	public UserDto createUser(UserDto userDto) {
		User user = this.dtoToUser(userDto);
		User savedUser = this.repo.save(user);
		
		return this.UserToDto(savedUser);
	}

	@Override
	public UserDto updateUser(UserDto userDto, Integer userId) {
		User user = this.repo.findById(userId).orElseThrow(() -> new ResourceNotFoundException("user","id",userId));
		
		user.setName(userDto.getName());
		user.setEmail(userDto.getEmail());
		user.setPassword(userDto.getPassword());
		user.setAbout(userDto.getAbout());
		
		User updatedUser = this.repo.save(user);
		
		UserDto userDto1 = this.UserToDto(updatedUser);
		return userDto1;
				
	}

	@Override
	public UserDto getUserById(Integer userId) {
		User user = this.repo.findById(userId).orElseThrow(()-> new ResourceNotFoundException("user","id",userId));
		return this.UserToDto(user);
	}

	@Override
	public List<UserDto> getAllUsers() {
		List<User> users= this.repo.findAll();
		
		List<UserDto> userDto = users.stream().map(user -> this.UserToDto(user)).collect(Collectors.toList());
		return userDto;
	}

	@Override
	public void deleteUser(Integer userId) {
		User user = this.repo.findById(userId).orElseThrow(()-> new ResourceNotFoundException("user","id",userId));
		this.repo.delete(user);
	}
	
	
	private User dtoToUser(UserDto userDto) {
		User user = new User();
		user.setId(userDto.getId());
		user.setName(userDto.getName());
		user.setEmail(userDto.getEmail());
		user.setAbout(userDto.getAbout());
		user.setPassword(userDto.getPassword());
		return user;
	}
	
	public UserDto UserToDto (User user) {
		UserDto userDto = new UserDto();
		userDto.setId(user.getId());
		userDto.setName(user.getName());
		userDto.setEmail(user.getEmail());
		userDto.setAbout(user.getAbout());
		userDto.setPassword(user.getPassword());
		return userDto;
	}
	
	

}
