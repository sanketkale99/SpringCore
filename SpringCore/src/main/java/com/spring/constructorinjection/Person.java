
package com.spring.constructorinjection;

import java.util.List;

public class Person {
	
	private int id;
	private String name;
	private Salary sal;
	private List<String> cities;
	
	public Person(int id, String name, Salary sal, List<String> cities) {
		this.id = id;
		this.name = name;
		this.sal=sal;
		this.cities=cities;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", sal=" + sal + ", cities=" + cities + "]";
	}

	
	
	
	
	
}
