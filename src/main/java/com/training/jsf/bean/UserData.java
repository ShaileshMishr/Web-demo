package com.training.jsf.bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;




@ManagedBean(name="data")
//@SessionScoped
@RequestScoped

public class UserData {
	
	private String usrClass;
	private String name; 
	private int rollNo;
	private int age;
	
	//private static final List<Student> studList = new ArrayList()<>
//	(Arrays.asList(
//			   new Student("Rohan","Civil",101,21),new Student("Kishan","Cse",102,22),
//			   new Student("Gaurav","ECE",103,24),new Student("Mohan","Mech",104,23)));
	
//	public List<Student> getStudents(){
//		return studList;
//	}
	
	private static final List<Student> studList = new ArrayList<>();
	
	public  List<Student> getStudents() {
		if(studList.size()==0) {
			
		Connection con = null;
		try {
			
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		 String url = "jdbc:mysql://localhost:3306/infinite";
		 
	        String user="root";
	        String password = "india@123";
	        
	    con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery("select * from student");
		
		
		while(rs.next()) {
			studList.add(new Student(rs.getString(1), rs.getString(2),rs.getInt(3),rs.getInt(4)));
		}
		
	} catch (Exception e) {
		
		e.printStackTrace();
	} 

finally {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
return studList;
	}
	else {
		return studList;
	}
	}
	
	public void addStudent() {
		studList.add(new Student(name, usrClass, rollNo, age));
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

//	public static List<Student> getStudlist() {
//		return studList;
//	}
	
	

}
