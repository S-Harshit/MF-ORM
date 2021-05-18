package com.ncu.entities.models;

public class Q3Model {

	String name;
	String age;
	String number;
	String password;
	String gender;
	String address;
	String course;

	public Q3Model() {

	}

	public Q3Model(String name, String age, String number, String password, String gender, String address,
			String course) {
		this.name = name;
		this.age = age;
		this.number = number;
		this.password = password;
		this.gender = gender;
		this.address = address;
		this.course = course;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

}