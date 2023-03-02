package com.spring.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component 	//this is stereotype annotation same as autowired annotation; used to create bean object without configuration class 
public class Student {
	
	@Value("Sanket Kale")		//assigned values to attributes explicitly
	private String sName;
	
	@Value("Pune")
	private String city;
	
	@Value("#{list1}") 	//used spring expression language
	private List<String> addresses;
	
	
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public List<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<String> addresses) {
		this.addresses = addresses;
	}
	
	@Override
	public String toString() {
		return "Student [sName=" + sName + ", city=" + city + ", addresses=" + addresses + "]";
	}

	
	

}
