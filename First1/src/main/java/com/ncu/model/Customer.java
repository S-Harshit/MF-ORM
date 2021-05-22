package com.ncu.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.ncu.validators.PasswordIntf;

public class Customer {

	@NotNull()
	@Size()
	private String firstName;

	private String lastName;
	
	@PasswordIntf(value = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]", message = "First Alphabet of the password must be capital and contains nummber and special  character")
	private String password;

	public Customer(String firstName, String lastName, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", courseCode=" 
				+ ", password=" + password + "]";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
