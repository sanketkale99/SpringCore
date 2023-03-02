package com.spring.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/reference/refconfig.xml");
		
		A aobj=(A) context.getBean("aref");
		
		System.out.println(aobj);
		
	}
}
