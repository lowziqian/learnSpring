package com.learnspring;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.learnspring.validation.CourseCode;

public class Customer {

	private String surName;
	
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	private String givenName;

	@NotNull(message="is required")
	@Min(value=1, message="must be between 1 and 10")
	@Max(value=10, message="must be between 1 and 10")
	private Integer freePass;
	
	@Pattern(regexp="[a-zA-Z0-9]{6}", message="only 6 digits or characters")
	private String postalCode;

	@CourseCode(value="TOP" , message="must start with TOP")
	private String courseCode;
		
	
	
	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public Integer getFreePass() {
		return freePass;
	}

	public void setFreePass(Integer freePass) {
		this.freePass = freePass;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getGivenName() {
		return givenName;
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

}
