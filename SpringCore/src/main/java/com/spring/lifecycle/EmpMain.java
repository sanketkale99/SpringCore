package com.spring.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/spring/lifecycle/configlifecycle.xml");

		context.registerShutdownHook(); 	//destroy method called using register shutdown hook
	
//		Employee eobj= (Employee) context.getBean("emp1");
//		System.out.println(eobj);
//		
//		
//		Employee1 eobj1=(Employee1) context.getBean("emp2");
//		System.out.println(eobj1);
		
		Employee2 eobj3=(Employee2) context.getBean("emp3");
		System.out.println(eobj3);
		
	}
	

}
