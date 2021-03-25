package com.ncu.LoanManagment.validators;

	   
	public class validators extends Exception{
		 validators(String s){  
			  super(s);  
			 }  
		 public static void isValidEmail(String email)throws validators {
		      String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		      if(!email.matches(regex)) {
		    	 throw new validators("Invaild Email");
		      }
		      else {
		    	  System.out.println("Email Verified");
		      	}
		 }
		      
		      public static void isValidAadhar(long Aadhar)throws validators {
			      String regex = "^[2-9]{1}[0-9]{3}\\s[0-9]{4}\\s[0-9]{4}$";;
			      if(!String.valueOf(Aadhar).matches(regex)) {
			    	 throw new validators("Invaild Aadhar");
			      }
			      else {
			    	  System.out.println("Aadhar Verified");
			      	}
		      }
		      
		      public static void isValidPAN(String PAN)throws validators {
			      String regex = "^[A-Z]{5}[0-9]{4}[A-Z]{1}";
			      if(!PAN.matches(regex)) {
			    	 throw new validators("Invalid PAN");
			      }
			      else {
			    	  System.out.println("PAN Verified");
			      	}
		      }
		      
	}
		
	
