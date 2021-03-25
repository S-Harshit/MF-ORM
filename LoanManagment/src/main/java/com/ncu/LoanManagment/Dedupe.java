package com.ncu.LoanManagment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ncu.LoanManagment.validators.validators;

public class Dedupe implements IDedupe {

	List<String> phoneNum = new ArrayList<>();

	String email;

	long  aadhar;

	String pan;

	int i = 0;

	public void setInfo(Sourcing sc, Education ed) {

		this.email = sc.getEmail();

		this.aadhar = ed.getAadhar();

		this.pan = ed.getPan();

		this.phoneNum = sc.getPhoneNum();

	}

	public boolean checkValdity() throws ClassNotFoundException, SQLException {

		boolean dbcheck = false;

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mform", "root", "qwerty");

		Statement stmt = con.createStatement();
		Statement stmt1 = con.createStatement();
		Statement stmt2 = con.createStatement();
		Statement stmt3 = con.createStatement();

		ResultSet rs = stmt.executeQuery("select email from custinfo");

		if (rs.next()) {
			   try{  
				    validators.isValidEmail(this.email);  
				}
			   catch(Exception m){
				   System.out.println(m);
				   dbcheck = false;}  
		}
		
		
		ResultSet rs3 = stmt3.executeQuery("select phone from custinfo");

		for (i = 0; i < phoneNum.size(); i++) {
			while (rs3.next()) {
					dbcheck = true;
			}
			//rs3.beforeFirst();
		}

		ResultSet rs1 = stmt1.executeQuery("select aadhar from custinfo");

		if (rs1.next()) {
			 try{  
				    validators.isValidAadhar(this.aadhar);  
				}
			   catch(Exception m){
				   System.out.println(m);
				   dbcheck = false;}  
		}

		ResultSet rs2 = stmt2.executeQuery("select pan from custinfo");

		if (rs2.next()) {
			try{  
			    validators.isValidPAN(this.pan);  
			}
		   catch(Exception m){
			   System.out.println(m);
			   dbcheck = false;}  
		}



		rs.close();
		stmt.close();
		rs1.close();
		stmt1.close();
		rs2.close();
		stmt2.close();
		rs3.close();
		stmt3.close();
		con.close();

		return dbcheck;

	}
}
