package com.ncu.aspected4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main10 {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JConfig.class);

		EmployeeService emps = (EmployeeService) context.getBean("emps");
		Employee emp = (Employee) context.getBean("emp");
		
		try {
			emps.getEmployeewithid(emp);
		} catch (IdException e) {
			e.printStackTrace();
		}
		
		((AbstractApplicationContext) context).close();

	}

}
