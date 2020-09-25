package com.bean;


public class Employee {
	public Employee(String emailid, String password) {
		super();
		this.emailid = emailid;
		this.password = password;
	}
	String emailid;
	String password;
	
	public String getemailid() {
		return emailid;
	}
	public void setemailid(String emailid) {
		this.emailid = emailid;
	}
	public String getpassword() {
		return password;
	}
	public void setpassword(String password) {
		this.password = password;
	}
}
