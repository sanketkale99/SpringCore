package com.spring.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/collection/collectionconfig.xml");
		
		Employee emp1=(Employee) context.getBean("Employee1");
		
		System.out.println(emp1.getEmpId());
		System.out.println(emp1.getName());
		System.out.println(emp1.getPhones());
		System.out.println(emp1.getAddr());
		System.out.println(emp1.getCourses());
		System.out.println(emp1.getPros());
		
	}

}
