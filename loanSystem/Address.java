package loanSystem;

import org.springframework.stereotype.Component;

//This class contains all getter and setter for all address information of the user.
@Component("add")
public class Address {

	String hno, city, state;

	public String getHno() {
		return hno;
	}

	public void setHno(String hno) {
		this.hno = hno;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
