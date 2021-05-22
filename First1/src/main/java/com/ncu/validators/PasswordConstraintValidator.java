 package com.ncu.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordConstraintValidator implements ConstraintValidator<PasswordIntf, String> {
	private String pass;

	@Override
	public void initialize(PasswordIntf min) {
		//TODO Auto-generated method stub
		this.pass = min.value();
	}
 
	@Override   
	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		System.out.println(value);
		if(value.matches(pass)) {
			System.out.println("Here");
			return true;
		}	
		System.out.println("Heres2");

		return false;
	}
}