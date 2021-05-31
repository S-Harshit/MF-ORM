package Assignmentoo;

import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component("emps")
public class EmployeeService {

	public void add() {
		System.out.println("add");
	}

	public void update() {
		System.out.println("update");
	}

	public void delete() {
		System.out.println("delete");
	}

	public void getEmployeewithid(Employee emp) throws IdException {

		System.out.println("Enter id");

		Scanner sc = new Scanner(System.in);

		long id = sc.nextLong();

		emp.setId(id);

		IdException.method(emp.getId());

		sc.close();
	}

}
