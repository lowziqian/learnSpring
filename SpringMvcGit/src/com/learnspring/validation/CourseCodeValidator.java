package com.learnspring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeValidator implements ConstraintValidator<CourseCode, String>{

	private String coursePrefix;
	
	@Override
	public void initialize(CourseCode theCourseCode)
	{
		coursePrefix =theCourseCode.value();
		
	}
	@Override
	public boolean isValid(String theEnteredCode, ConstraintValidatorContext theConstraintValidatorContext) {
		
		if(theEnteredCode == null)
		{
			return false;
		}
		else return theEnteredCode.startsWith(coursePrefix);
		
		
//		return false;
	}

}
