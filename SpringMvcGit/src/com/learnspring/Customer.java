package com.learnspring;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {

	private String surName;
	
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	private String givenName;

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
