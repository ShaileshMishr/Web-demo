package com.training.jsf.bean;

public class Student {

	private String usrClass;
	private String name;
	private int rollNo;
	private int age;
	public Student(String usrClass, String name, int rollNo, int age) {
		
		super();
		this.usrClass = usrClass;
		this.name = name;
		this.rollNo = rollNo;
		this.age = age;
	}
	
	
	
	public String getUsrClass() {
		return usrClass;
	}
	public void setUsrClass(String usrClass) {
		this.usrClass = usrClass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
