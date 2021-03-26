package loanSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

import org.springframework.stereotype.Component;

import loanSystem.validators.Validators;

//This class contains all the methods for processing of loan.
@Component("loan")
public class LoanProcess implements ILoanProcess {

	String email;

	long aadhar;

	String pan;

	String phone;

	int i = 0;

	double trueIncome;

	int age;

	final double min = 500000d;

	final double agemin = 20;

	// method to retrieve information required to calculate credit score.
	public void setInfoForScore(ICustomer ic) {

		this.trueIncome = trueIncome(ic);

		this.age = ic.getAge();
	}

	// method to calculate credit score.
	public double getScore() {

		if (this.trueIncome <= 10000000 && this.trueIncome >= min) {
			if (this.age <= 40 && this.age >= 25) {
				return 50d;
			} else if (this.age > 40) {
				return 30d;
			} else if (this.age < 25 && this.age > agemin) {
				return 15d;
			} else
				return 0d;
		}

		else if (this.trueIncome <= 50000000 && this.trueIncome > 10000000) {
			if (this.age <= 40 && this.age >= 25) {
				return 70d;
			} else if (this.age > 40) {
				return 50d;
			} else if (this.age < 25 && this.age > agemin) {
				return 25d;
			} else
				return 0d;
		}

		else if (this.trueIncome > 50000000) {
			if (this.age <= 40 && this.age >= 25) {
				return 100d;
			} else if (this.age > 40) {
				return 80d;
			} else if (this.age < 25 && this.age > agemin) {
				return 40d;
			} else
				return 0d;
		}

		else
			return 0d;
	}

	// method used to retrieve information to check if the customer is valid for
	// loan or not.
	public void setInfo(ICustomer ic) {

		this.email = ic.getEmail();

		this.aadhar = ic.getAadhar();

		this.pan = ic.getPan();

		this.phone = ic.getPhone();

	}

	// method to check if customer is valid for a loan.
	public boolean checkValdity() throws ClassNotFoundException, SQLException {

		boolean dbcheck = false;

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mform", "root", "My@Sql.");

		Statement stmt = con.createStatement();
		Statement stmt1 = con.createStatement();
		Statement stmt2 = con.createStatement();
		Statement stmt3 = con.createStatement();

		ResultSet rs = stmt.executeQuery("select email from custinfo");

		if (rs.next()) {
			try {
				Validators.isValidEmail(this.email);
			} catch (Exception m) {
				System.out.println(m);
				dbcheck = true;
			}
		}

		ResultSet rs1 = stmt1.executeQuery("select aadhar from custinfo");

		if (rs1.next()) {
			try {
				Validators.isValidAadhar(this.aadhar);
			} catch (Exception m) {
				System.out.println(m);
				dbcheck = true;
			}
		}

		ResultSet rs2 = stmt2.executeQuery("select pan from custinfo");

		if (rs2.next()) {
			try {
				Validators.isValidPAN(this.pan);
			} catch (Exception m) {
				System.out.println(m);
				dbcheck = true;
			}
		}

		ResultSet rs3 = stmt2.executeQuery("select phone from custinfo");

		if (rs3.next()) {
			try {
				Validators.isValidPhone(this.phone);
			} catch (Exception m) {
				System.out.println(m);
				dbcheck = true;
			}
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

	// method to generate an unique application number.
	public String generate(ICustomer ic) {
		Random rn = new Random();
		String appNum = ic.getPhone() + Integer.toString(rn.nextInt(10000));
		return appNum;

	}

	// method to calculate true income on the basis of which loan will be passed.
	public double trueIncome(ICustomer ic) {
		// TODO Auto-generated method stub
		double trueIncome;

		trueIncome = (ic.getIncome() + ic.getAssetValue()) - ic.getLiabilityValue();

		return trueIncome;
	}
}
