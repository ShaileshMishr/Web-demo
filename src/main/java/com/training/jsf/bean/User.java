package com.training.jsf.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="user")
@RequestScoped
public class User {

	private String userName;
	private String password;
	private String email;
	
	
	
	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String sayHi() {
		if(userName == null || userName.equals("")) {
			return "fail";
		}
		
		else if(password == null || password.equals("")) {
			return "fail";
		}
		else {
			return "success";
		}
	}
	
	
}
