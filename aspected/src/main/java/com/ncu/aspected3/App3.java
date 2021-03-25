package com.ncu.aspected3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(JConfig.class);

		Random r = (Random) context.getBean("r");

		r.print();

		((AbstractApplicationContext) context).close();

	}

}
