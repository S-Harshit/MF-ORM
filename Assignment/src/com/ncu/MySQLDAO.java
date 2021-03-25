package com.ncu;

import java.sql.*;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySQLDAO implements Idao {

	static {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void addMovies(Moviesdata obj) throws SQLException {
		
		System.out.println("After Adding");
		obj.setID(123);
		obj.setName("MikeWasouski");
		obj.setRating(10);
		obj.setReviews("Monsters Inc");

		String Add = "INSERT INTO movies " + "VALUES (" + obj.getID() + ",'" + obj.getName() + "'," + obj.getRating()
				+ ",'" + obj.getReviews() + "')";

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "qwerty");
		Statement stmt = con.createStatement();

		int codes = stmt.executeUpdate(Add);

		if (codes == 1) {
			System.out.println("Successfully Added !!");
		} else {
			System.out.println("Failed due to :" + codes);
		}

	}

	public void deleteMovies(Moviesdata obj) throws SQLException {
		
		System.out.println("After Delete");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "qwerty");
		Statement stmt = con.createStatement();

		int ids = obj.getID();
		String deletes = "DELETE from movies where ID = " + ids;
		int codes = stmt.executeUpdate(deletes);
	}

	public void updateMovies(Moviesdata obj) throws SQLException {
		System.out.println("After Update");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "qwerty");
		Statement stmt = con.createStatement();

		obj.setID(123);
		obj.setName("Dragon Ball Super");
		obj.setReviews("AnimeMovie");
		String updates = "UPDATE movies SET Name= " + "'" + obj.getName() + "',Reviews='"+ obj.getReviews() + "' WHERE ID= " + obj.getID();

		int codes = stmt.executeUpdate(updates);

	}

	public void viewMovies(Moviesdata obj) throws SQLException {
		System.out.println("After View");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "qwerty");
		Statement stmt = con.createStatement();
		ResultSet st = stmt.executeQuery("select * from movies");
		while (st.next()) {
			obj.setID(st.getInt("ID"));
			obj.setName(st.getString("Name"));
			obj.setRating(st.getInt("Rating"));
			obj.setReviews(st.getString("Reviews"));
			System.out.println(" Movie ID: " + obj.getID() + "\n Name: " + obj.getName() + "\n Rating: "
					+ obj.getRating() + "\n Review: " + obj.getReviews());
		}

	}

}
