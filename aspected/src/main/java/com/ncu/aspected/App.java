package com.ncu.aspected;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(JConfig.class);
		Employee emp = (Employee) context.getBean("emp");
		emp.calculate_sal();
		emp.setName("blabla");
		emp.getName();
		
		((AbstractApplicationContext) context).close();

	}

}
