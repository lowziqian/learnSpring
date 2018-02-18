package com.learnspring;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {

	private String surName;
	
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	private String givenName;

	@Min(value=1, message="must be between 1 and 10")
	@Max(value=10, message="must be between 1 and 10")
	private int freePass;
	
	@Pattern(regexp="[a-zA-Z0-9]{6}", message="only 6 digits or characters")
	private String postalCode;
	
	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public int getFreePass() {
		return freePass;
	}

	public void setFreePass(int freePass) {
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
