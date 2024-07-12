package com.apcfss.RequestClasses;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CrudRequest {

	@JsonProperty("my_name")
	private String name;
	private String email;
	private String location;
	private long mobile;
	
	


	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getLocation() {
		return location;
	}




	public void setLocation(String location) {
		this.location = location;
	}




	public long getMobile() {
		return mobile;
	}




	public void setMobile(long mobile) {
		this.mobile = mobile;
	}




	@Override
	public String toString() {
		return "CrudRequest [name=" + name + ", email=" + email + ", location=" + location + ", mobile=" + mobile + "]";
	}
	
	
}
