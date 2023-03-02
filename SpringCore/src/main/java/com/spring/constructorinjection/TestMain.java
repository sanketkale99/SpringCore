package com.spring.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/constructorinjection/ciconfig.xml");
		
		Person pobj=(Person) context.getBean("person1");
		
		System.out.println(pobj);

	}

}
