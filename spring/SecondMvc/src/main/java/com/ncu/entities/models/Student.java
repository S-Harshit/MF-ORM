package com.ncu.entities.models;

public class Student {
	public String name;
	public int id;

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

}
