package com.ncu.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class FormPasswordLogic implements ConstraintValidator<FormPassword, String> {

	private String[] coursePrefix;

	@Override
	public void initialize(FormPassword theCourseCode) {
		// TODO Auto-generated method stub
		coursePrefix = theCourseCode.value();
		for (String i : coursePrefix) {
			System.out.println(i);
		}
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub

		System.out.println(value);

		boolean result = false;
		if (value != null) {
			for (String k : coursePrefix) {
				result = value.startsWith(k);
				if (result) {
					break;
				} else
					result = false;
			}
		}

		return result;

	}
}
