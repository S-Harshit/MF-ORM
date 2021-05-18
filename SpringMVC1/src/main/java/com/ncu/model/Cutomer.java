package com.ncu.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.ncu.validation.CourseCodeV;
import com.ncu.validation.CoursePassword;

public class Cutomer {

	private String firstName;

	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String lastName;

//	@NotNull(message = "is required")
//	@Min(value = 0, message = "must be greater than or equal to zero")
//	@Max(value = 10, message = "must be less than or equal to 10")
	private Integer freePasses;

	// @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 chars/digits")
	private String postalCode;

	@CourseCodeV(value = { "CSE", "ECE", "CSL", "SOM" }, message = "must start with CSE,ECE,CSL,SOM")
	private String courseCode;

	@CoursePassword(value = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$", message = "Minimum eight characters, at least one uppercase letter, one lowercase letter, one number and one special character")
	private String password;

	public Cutomer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cutomer(String firstName,
			@NotNull(message = "is required") @Size(min = 1, message = "is required") String lastName,
			Integer freePasses, String postalCode, String courseCode, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.freePasses = freePasses;
		this.postalCode = postalCode;
		this.courseCode = courseCode;
		this.password = password;
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

	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Cutomer [firstName=" + firstName + ", lastName=" + lastName + ", freePasses=" + freePasses
				+ ", postalCode=" + postalCode + ", courseCode=" + courseCode + ", password=" + password + "]";
	}

}