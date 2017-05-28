package com.da.beans;

public class LoginBean {
	private String userName;
	private String password;
	private String role;
	public LoginBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public LoginBean(String userName, String password, String role) {
		super();
		this.userName = userName;
		this.password = password;
		this.role = role;
	}
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	

	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
