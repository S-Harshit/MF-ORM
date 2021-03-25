package com.ncu.LoanManagment;

import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		int input;
		String input2="";
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println("For New User Press 1");
		System.out.println("For New Existing User Press 2");
		System.out.println("For Press 3 To Exit");
		Scanner inp = new Scanner(System.in);
		input = inp.nextInt();
		switch (input) {
		case 1:

			Sourcing info = (Sourcing) context.getBean("info");
			IGenerate gen = (Generate) context.getBean("gen");
			QuickData quickinfo = (QuickData) context.getBean("quickinfo");
			Education edu = (Education) context.getBean("edu");
			IDedupe dupe = (Dedupe) context.getBean("dupe");
			IIOOperation io = (IOOperation) context.getBean("io");
			IScoring score = (Scoring) context.getBean("score");
			
			
			System.out.println("Enter Your FullName");
			info.setFullName(inp.next());
			System.out.println("Enter Your Age");
			info.setAge(inp.nextInt());
			System.out.println("Enter Your Email");
			info.setEmail(inp.next());
			System.out.println("Enter Your Address");
			info.setAddress(inp.next());

			List<String> phoneNum = new ArrayList<>();
			System.out.println("Enter your Phone Number");
			phoneNum.add(inp.next());
			System.out.println("Enter your AnotherPhone Number");
			phoneNum.add(inp.next());
			info.setPhoneNum(phoneNum);

			System.out.println("Enter Income");
			quickinfo.setIncome(inp.nextDouble());
			System.out.println("Enter AssetValue");
			quickinfo.setAssetValue(inp.nextDouble());
			System.out.println("Enter Liability");
			quickinfo.setLiabilityValue(inp.nextDouble());
			
			gen.trueIncome(quickinfo);

			System.out.println("What is Your Aadhar No");
			edu.setAadhar(inp.nextLong());
			System.out.println("What is Your PAN No");
			edu.setPan(inp.next());
	
			dupe.setInfo(info, edu);
			
			try {
				if(dupe.checkValdity()) {
					System.out.println("Loan Approved");
					score.setInfo(info, gen, quickinfo);
					System.out.println("Credit Score: "+ score.getScore());
					io.write(info, edu, quickinfo, gen, score);
				}
				else {
					System.out.println("Application Rejected Because Of discrepancies in Personal Info");
				}
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
			break;

		case 2:
			System.out.println("Enter Your Application Number");
			input2 = inp.next();
			IIOOperation io1 = (IOOperation) context.getBean("io");
			io1.read(input2);
			break;
		
		case 3:
				inp.close();
				((ClassPathXmlApplicationContext)context).close();
				System.out.println("Program Exited Successfully!!");
		
		}

	}
}
