package com.spring.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpMain {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/autowire/annotation/autoconfig.xml");
		
		Emp emp1=(Emp) context.getBean("emp");
		
		System.out.println(emp1);

	}

}
