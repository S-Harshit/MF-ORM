package loanSystem;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//This is the main class.
public class MainApp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String redo = "y";

		int input;

		String input2 = "";

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		Scanner inp = new Scanner(System.in);

		Scanner inp1 = new Scanner(System.in);

		while (redo.equalsIgnoreCase("y")) {

			System.out.println("For New User Press 1");
			System.out.println("For New Existing User Press 2");
			System.out.println("For Press 3 To Skip To End");
			input = inp1.nextInt();

			switch (input) {
			case 1:

				ICustomer custInfo = (Customer) context.getBean("cust");

				Address add = (Address) context.getBean("add");

				LoanReq loan = (LoanReq) context.getBean("loanreq");

				ILoanProcess loanProcess = (LoanProcess) context.getBean("loan");

				IIOOperation io = (IOOperation) context.getBean("io");

				System.out.println("Enter Your FullName");
				custInfo.setFullName(inp.next());

				System.out.println("Enter Your Age");
				custInfo.setAge(inp.nextInt());

				System.out.println("Enter Your Email");
				custInfo.setEmail(inp.next());

				System.out.println("Enter Your Hno: ");
				add.setHno(inp.next());

				System.out.println("Enter Your City: ");
				add.setCity(inp.next());

				System.out.println("Enter Your State: ");
				add.setState(inp.next());

				System.out.println("Enter your Phone Number: ");
				custInfo.setPhone(inp.next());

				System.out.println("Enter kind of loan required: ");
				loan.setKind(inp.next());

				System.out.println("Enter amount of loan required: ");
				loan.setAmount(inp.nextInt());

				// Generating the unique application number.
				System.out.println("Your app no. is: " + loanProcess.generate(custInfo));

				System.out.println("Enter Income");
				custInfo.setIncome(inp.nextDouble());

				System.out.println("Enter AssetValue");
				custInfo.setAssetValue(inp.nextDouble());

				System.out.println("Enter Liability");
				custInfo.setLiabilityValue(inp.nextDouble());

				// Calculating true income.
				loanProcess.trueIncome(custInfo);

				System.out.println("What is Your Aadhar No");
				custInfo.setAadhar(inp.nextLong());

				System.out.println("What is Your PAN No");
				custInfo.setPan(inp1.next());

				// Setting info to check validity for loan.
				loanProcess.setInfo(custInfo);

				// Checking validity of loan for customer on basis of certain criteria.
				try {
					if (!loanProcess.checkValdity()) {

						System.out.println("All personal details verified");

						// Setting info to calculate credit score.
						loanProcess.setInfoForScore(custInfo);

						double score = loanProcess.getScore();
						System.out.println("Credit Score: " + score);

						if (score > 20d) {

							System.out.println("Loan Approved");
							io.write(custInfo, loanProcess, add, loan);

						} else
							System.out.println("Application Rejected Because Of low credit score");
					} else {
						System.out.println("Application Rejected Because Of discrepancies in Personal Info");
					}

				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				}

				break;

			case 2:

				System.out.println("Enter Your Application Number");
				input2 = inp.next();

				IIOOperation io1 = (IOOperation) context.getBean("io");

				// Reading matching data from sql database.
				io1.read(input2);
				break;

			case 3:

				break;
			}

			System.out.println("Enter 'y' to continue or enter any other key to exit.");
			redo = inp1.next();

		}

		// closing resources.
		inp.close();
		inp1.close();
		((ClassPathXmlApplicationContext) context).close();
	}

}
