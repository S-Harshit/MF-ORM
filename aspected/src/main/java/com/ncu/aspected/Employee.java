package com.ncu.aspected;

import org.springframework.stereotype.Component;

@Component("emp")
public class Employee {

	String name, address;

	int age, no_of_days;

	public void calculate_sal() {
		System.out.println("Calulate salary");
	}
	
	public String getName() {
		System.out.println("getName");
		return name;
	}

	public void setName(String name) {
		System.out.println("setName");
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNo_of_days() {
		return no_of_days;
	}

	public void setNo_of_days(int no_of_days) {
		this.no_of_days = no_of_days;
	}

}
