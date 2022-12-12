package com.blogging.bloggingapp.payloads;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {
	
	
	private int id;
	
	@NotEmpty
	@Size(min = 4, message = "Username must be min of 4 characters")
	private String name;
	
	@Email(message = "Email not valid")
	private String email;
	
	@NotEmpty
	@Size(max = 10, min = 3, message = "Password must be min 3 characters and max 10 characters")
//	@Pattern(regexp = "")
	private String password;
	
	@NotEmpty
	private String about;
}
