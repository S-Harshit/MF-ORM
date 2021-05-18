package com.ncu.customvalidator.validation;

import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {
	private String[] min;

	@Override
	public void initialize(CourseCode min) {
		// TODO Auto-generated method stub
		this.min = min.value();
		System.out.println(" this is:" + min);
	}

//	@Override
//	public boolean isValid(String value, ConstraintValidatorContext context) {
//		// TODO Auto-generated method stub
//
//		boolean result;
//		if (value != null) {
//			result = value.startsWith(coursePrefix);
//		} else {
//			result = true;
//		}
//
//		return result;
//	}

//	@Override
//	public boolean isValid(List<String> value, ConstraintValidatorContext context) {
//		// TODO Auto-generated method stub
//		if(value.size() > min) {
//			return true;
//		}else {
//			return false;
//		}
//	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < min.length; i++) {
			if(value.toUpperCase().equals(min[i])) 
				return true;
		}
		return false;
	}
}
