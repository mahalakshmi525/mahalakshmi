package com.cts.training.web.model;

public class Student {
	private String uname;
	private String email;
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getEmail() {
	
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
		if(this.email == null)
			this.email = "dummy@mail.com";
	}
}
