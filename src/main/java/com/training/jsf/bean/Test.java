package com.training.jsf.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="test")
@RequestScoped

public class Test {
	
	@ManagedProperty(value = "#{param.pageId}")
	private String pageId;

	public String getPageId() {
		return pageId;
	}

	public void setPageId(String pageId) {
		this.pageId = pageId;
	}
	
	public String displayPage() {
		if(pageId==null) {
			return "helloworld";
		}
		if(pageId.equals("test")) {
			return "test";
		}
		else if(pageId.equals("welcome")) {
			return "welcome";
		}
		else {
			return "home";
		}
		
		
	}
	

}
