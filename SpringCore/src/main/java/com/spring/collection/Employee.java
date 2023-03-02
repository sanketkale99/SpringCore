package com.spring.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {

	private int empId;
	private String name;
	private List<String> phones;
	private Set<String> addr;
	private Map<String , String> courses;
	private Properties pros;

	public Employee(int empId, String name, List<String> phones, Set<String> addr, Map<String, String> courses, Properties pros) {
		super();
		this.empId = empId;
		this.name = name;
		this.phones = phones;
		this.addr = addr;
		this.courses = courses;
		this.pros = pros;
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddr() {
		return addr;
	}
	public void setAddr(Set<String> addr) {
		this.addr = addr;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public Properties getPros() {
		return pros;
	}
	public void setPros(Properties pros) {
		this.pros = pros;
	}
	
}
