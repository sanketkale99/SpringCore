package com.spring.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	
	@Autowired
	private Department dept;

	public Student(Department dept) {
		super();
		this.dept = dept;
	}	

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public void study()
	{
		this.dept.dName();
		System.out.println("student is studying");
	}

}
