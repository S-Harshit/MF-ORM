package com.ncu.LoanManagment;

import java.util.ArrayList;
import java.util.List;

public class Sourcing {

	String fullName, address, email, loanType;

	int age;

	List<String> phoneNum = new ArrayList<>();

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<String> getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(List<String> phoneNum) {
		this.phoneNum = phoneNum;
	}

}
