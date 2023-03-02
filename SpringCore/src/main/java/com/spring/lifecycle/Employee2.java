package com.spring.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Employee2 {
	
	private String empCity;
	private double eSal;
	
	public Employee2() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getEmpCity() {
		return empCity;
	}

	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}

	public double geteSal() {
		return eSal;
	}

	public void seteSal(double eSal) {
		this.eSal = eSal;
	}

	@Override
	public String toString() {
		return "Employee2 [empCity=" + empCity + ", eSal=" + eSal + "]";
	}
	
	@PostConstruct
	public void init()
	{
		System.out.println("This is an annotation initialize method ");
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("This is an annotation destroy method ");
	}
}
