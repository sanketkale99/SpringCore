package com.spring.lifecycle;

public class Employee {

	private double empSal;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return "Employee [empSal=" + empSal + "]";
	}
	
	public void init() {
		System.out.println("Invoked Init Method..");
	}
	
	public void destroy()
	{
		System.out.println("Destroy Method..");
	}
	
}
