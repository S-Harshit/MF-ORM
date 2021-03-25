package com.ncu.LoanManagment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class IOOperation implements IIOOperation {

	@Override
	public void read(/* IGenerate ign, Sourcing sc */String appNo) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mform", "root", "qwerty");

		Statement stmt = con.createStatement();

		ResultSet rs = stmt.executeQuery("select * from custinfo where appnum = '" + /* ign.generate(sc) */appNo + "'");

		System.out.println(
				"Name\t|\tAddress\t|\tEmail\t|\tLoan Type\t|\tPhone Number\t|\tAge\t|\tAadhar\t|\tPan\t|\tScore\t|\tApp Num\t|\tTrue Income");
		while (rs.next()) {
			System.out.println(rs.getString("name") + "\t|\t" + rs.getString("address") + "\t|\t"
					+ rs.getString("email") + "\t|\t" + rs.getString("loantype") + rs.getString("phone")
					+ rs.getInt("age") + rs.getInt("aadhar") + rs.getString("pan") + rs.getDouble("score")
					+ rs.getString("appnum") + rs.getDouble("trueIncome"));
		}

		rs.close();
		stmt.close();
		con.close();
	}

	public void write(Sourcing sc, Education ed, QuickData qd, IGenerate ign, IScoring isc)
			throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mform", "root", "qwerty");

		Statement stmt = con.createStatement();

		List<String> phone = new ArrayList<>();

		phone = sc.getPhoneNum();

		String phoneNum = "";

		for (int i = 0; i < phone.size(); i++) {
			phoneNum = phone.get(i) + ", ";
		}

		String query = "insert into custinfo values('" + sc.getFullName() + "', '" + sc.getAddress() + "', '"
				+ sc.getEmail() + "', '" + sc.getLoanType() + "', '" + phoneNum + "', " + sc.getAge() + ", "
				+ ed.getAadhar() + ", '" + ed.getPan() + "', " + isc.getScore() + ", '" + ign.generate(sc) + "', "
				+ ign.trueIncome(qd) + ")";

		int insert = stmt.executeUpdate(query);

		if (insert == 1) {
			System.out.println("Successfull :)");
		} else
			System.out.println("Fail :(");

		stmt.close();
		con.close();
	}

}
