package com.spring.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	@Bean
	public Department getDept()
	{
		return new Department();
	}
	
	@Bean(name = {"stud", "temp", "mybean"}) 	// we can this bean using multiple names 
	public Student getStudent()
	{
		Student stud=new Student(getDept());
		return stud;
	}
}
