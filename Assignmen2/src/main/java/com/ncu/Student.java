package com.ncu;

import org.springframework.stereotype.Component;

@Component
public class Student {  
private int id;  
private String name;  
private String dept_name;
private int tot_cred; 
//no-arg and parameterized constructors  
//getters and setters  
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDept_name() {
	return dept_name;
}
public void setDept_name(String dept_name) {
	this.dept_name = dept_name;
}
public int getTot_cred() {
	return tot_cred;
}
public void setTot_cred(int tot_cred) {
	this.tot_cred = tot_cred;
}

@Override
public String toString() {
	return " " + id + " " + name + "" + dept_name + " " + tot_cred + " has been added to DataBase";
 }
}  