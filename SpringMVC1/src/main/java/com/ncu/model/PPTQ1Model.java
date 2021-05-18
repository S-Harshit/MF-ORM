package com.ncu.model;

import com.ncu.validation.CourseCodeV;

public class PPTQ1Model {

	@CourseCodeV(value = { "CSE", "ECE", "CSL", "SOM" }, message = "must start with CSE,ECE,CSL,SOM")
//	@CourseCodeV
	String CourseCode;

	public String getCourseCode() {
		return CourseCode;
	}

	public void setCourseCode(String courseCode) {
		CourseCode = courseCode;
	}

}
