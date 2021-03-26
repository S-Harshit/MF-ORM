package loanSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.stereotype.Component;

//This class is used for I/O operations on SQL database.
@Component("io")
public class IOOperation implements IIOOperation {

	// method used to retrieve data from sql database.
	@Override
	public void read(String appNo) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mform", "root", "My@Sql.");

		Statement stmt = con.createStatement();

		ResultSet rs = stmt.executeQuery("select * from custinfo where appnum = '" + appNo + "'");

		System.out.println(
				"Name\t|\tAddress\t\t|\tEmail\t\t|\tLoan Type\t|\tPhone Number\t|\tAge\t|\tAadhar\t\t|\tPan\t\t|\tScore\t|\tApp Num\t\t|\tTrue Income\t\t|\t");
		while (rs.next()) {
			System.out.println(rs.getString("name") + "\t|\t" + rs.getString("address") + "\t|\t"
					+ rs.getString("email") + "\t\t|\t" + rs.getString("loantype") + "\t|\t" + rs.getInt("phone")
					+ "\t|\t" + rs.getInt("age") + "\t|\t" + rs.getLong("aadhar") + "\t|\t" + rs.getString("pan")
					+ "\t|\t" + rs.getDouble("score") + "\t|\t" + rs.getString("appnum") + "\t|\t"
					+ rs.getDouble("trueIncome") + "\t\t|\t");
		}

		rs.close();
		stmt.close();
		con.close();
	}

	// method used to write new data into sql database.
	public void write(ICustomer ic, ILoanProcess il, Address add, LoanReq loan)
			throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mform", "root", "My@Sql.");

		Statement stmt = con.createStatement();

		String query = "insert into custinfo values('" + ic.getFullName() + "', '" + ic.getAddress(add) + "', '"
				+ ic.getEmail() + "', '" + ic.getLoan(loan) + "', " + ic.getPhone() + ", " + ic.getAge() + ", "
				+ ic.getAadhar() + ", '" + ic.getPan() + "', " + il.getScore() + ", '" + il.generate(ic) + "', "
				+ il.trueIncome(ic) + ")";

		int insert = stmt.executeUpdate(query);

		if (insert == 1) {
			System.out.println("Successfull :)");
		} else
			System.out.println("Fail :(");

		stmt.close();
		con.close();
	}

}
