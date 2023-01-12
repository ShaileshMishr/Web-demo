package com.training.jsf.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="helloWorld")
@SessionScoped

public class HelloWorld {
	
	private String value="New Value";
	public String getMessage() {
		return "Hello World from JSF..";
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	

}
