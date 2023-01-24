package com.one.payload;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {
	private int id;
	
	@NotNull
	@Size(min=4,message="minimum 4 char name!!")
	private String name;
	
	@Email
	private String email;
	
	@NotEmpty
	@Size(min=3,max=10,message="password must be minimum 3 char and max 10 chars !!")
	private String password;
	
	@NotEmpty
	private String about;
}
