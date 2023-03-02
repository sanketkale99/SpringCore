package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
		//initiating a IOC container				defined classpath for xml file
        ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");  //add class path of XML file
        
        Student stud1=(Student) context.getBean("student1");
        Student stud2=(Student) context.getBean("student2");
        Student stud3=(Student) context.getBean("student3");
        
        System.out.println(stud1); //get student info from xml because IOC container make the object of that class and return the values 
		// used setter DI  ;; get object from IOC Container
        System.out.println(stud2);
        System.out.println(stud3);
        
    }
} 
