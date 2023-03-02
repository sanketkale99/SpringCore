package com.spring.constructorinjection;

public class Salary {
	
	private int salary;

	public Salary(int salary) {
		super();
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Salary [salary=" + salary + "]";
	}
	
}
