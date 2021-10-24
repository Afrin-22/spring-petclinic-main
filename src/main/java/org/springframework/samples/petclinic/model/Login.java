package org.springframework.samples.petclinic.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Login {

	@NotBlank(message = "User name cannot be empty!!")
	@Size(min = 4, max = 12, message = "User name must be between 4 - 12 characters")
	private String user;

	@NotBlank(message = "password cannot be empty!!!")
	// @Pattern(regexp =
	// "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[*.!@$%^&(){}[]:;<>,.?/~_+-=|\\]).{8,32}$",
	// message = "Invalid Password")
	private String password;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
