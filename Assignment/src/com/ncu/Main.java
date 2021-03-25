package com.ncu;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) throws SQLException {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Moviesdata obj1 = (Moviesdata) context.getBean("mov");
		Idao obj = (Idao) context.getBean("ida");

		try {
			obj.addMovies(obj1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		obj.updateMovies(obj1);

		obj.viewMovies(obj1);

		obj.deleteMovies(obj1);
	}
}
