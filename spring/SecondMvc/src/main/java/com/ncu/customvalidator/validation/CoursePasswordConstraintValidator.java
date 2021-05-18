package com.ncu.customvalidator.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CoursePasswordConstraintValidator implements ConstraintValidator<CoursePassword, String> {
	private String pass;

	@Override
	public void initialize(CoursePassword min) {
		// TODO Auto-generated method stub
		this.pass = min.value();
		System.out.println(" this is:" + min);
	}

	
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		
		if(value.matches(pass)) { 
			return true;
		}
		return false;
	}
}

