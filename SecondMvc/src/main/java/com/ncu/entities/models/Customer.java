package com.ncu.entities.models;

import java.util.Date;
import java.util.List;

public class Customer {

	private String name;
	private String password;
	private Long id;
	private Date dob;
	private List<String> courses;
	private String gender;
	private String type;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String name, String password, Long id, Date dob, List<String> courses, String gender, String type) {
		super();
		this.name = name;
		this.password = password;
		this.id = id;
		this.dob = dob;
		this.courses = courses;
		this.gender = gender;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", password=" + password + ", id=" + id + ", dob=" + dob + ", courses="
				+ courses + ", gender=" + gender + ", type=" + type + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
