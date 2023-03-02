package com.spring.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/standalone/collection/standaloneconfig.xml");
		
		Person person= (Person)context.getBean("person1");
		
		System.out.println(person.getFriends());
		
		System.out.println(person.getFriends().getClass().getName());
		
		System.out.println(person.getFees());
		
		System.out.println(person.getProps());

	}

}
