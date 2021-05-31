package Assignmentoo;

import org.springframework.stereotype.Component;

@Component("emp")
public class Employee {

	private long id;

	private String fn, ln, email;

	Employee() {
	}

	Employee(long id, String fn, String ln, String email) {

		this.id = id;

		this.fn = fn;

		this.ln = ln;

		this.email = email;

	}

	public void setId(long id) {
		this.id = id;
	}

	public void setFn(String fn) {
		this.fn = fn;
	}

	public void setLn(String ln) {
		this.ln = ln;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getId() {
		return id;
	}

	public String getFn() {
		return fn;
	}

	public String getLn() {
		return ln;
	}

	public String getEmail() {
		return email;
	}

}
