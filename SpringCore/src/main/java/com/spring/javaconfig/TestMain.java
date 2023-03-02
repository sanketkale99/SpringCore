package com.spring.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {

	public static void main(String[] args) {

		ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Student stud= context.getBean("getStudent", Student.class);
		
		System.out.println(stud);
		
		stud.study();

	}

}
