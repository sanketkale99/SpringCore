package com.spring.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpMain {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/autowire/autoconfig.xml");
		
		Emp emp=(Emp) context.getBean("emp");
		
		System.out.println(emp);

	}

}
