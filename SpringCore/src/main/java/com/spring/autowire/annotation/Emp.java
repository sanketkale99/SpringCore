package com.spring.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	
	@Autowired 
	@Qualifier("temp")  //select temp bean from configuration file
	private Address address;

	//@Autowired  - autowired using constructor injection 
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("Inside Constructor");
	}

	
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Address getAddress() {
		return address;
	}

	//	@Autowired  -autowired using setter injection
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("Inside setter method..");
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
	
}
