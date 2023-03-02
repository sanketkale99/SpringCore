package com.spring.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/stereotype/stereoconfig.xml");
		
		Student stud=(Student) context.getBean("student");
		
		System.out.println(stud);

	}

}
