package com.spring.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee1 implements InitializingBean, DisposableBean{
	
	private int empId;
	private String eName;
	
	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	@Override
	public String toString() {
		return "Employee1 [empId=" + empId + ", eName=" + eName + "]";
	}
	@Override
	public void afterPropertiesSet() throws Exception { //same as init method, implements from InitializingBean
		System.out.println("This is init method..");
		
	}
	@Override
	public void destroy() throws Exception { 	//same as destroy method, implements from DisposableBean
		System.out.println("This is destroy method..");
		
	}
	
	

}
