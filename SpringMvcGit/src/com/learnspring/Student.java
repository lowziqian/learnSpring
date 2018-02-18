package com.learnspring;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Student {

	private String surName;
	
	@NotNull
	@Size(min=1, message="is required")
	private String name;
	
	private String Country;
	private String favoriteLanguage;

	//for checkbox, need array to store more than 1 values
	private String[] operatingSystem;
	

	public String[] getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String[] operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	
	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}



}
