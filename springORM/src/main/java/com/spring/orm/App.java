package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
        StudentDao studentDao = context.getBean("StudentDao", StudentDao.class);
        
        
 
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        boolean flag=true;
        while(flag)
        {
        	System.out.println("1-Add new student");
        	System.out.println("2-Display All stundent");
        	System.out.println("3-Display one student");
        	System.out.println("4-Delete student");
        	System.out.println("5-Update student");
        	System.out.println("6-Exit");
        	
        	try {
				int input = Integer.parseInt(br.readLine());
				
				switch (input) {
				case 1://add new student
					
					break;
				case 2://display all
					
					break;
				case 3: //display single 
					
					break;
				case 4://delete record
					
					break;
					
				case 5://update record
					
					break;
				case 6://exit
					flag=false;
					break;
				}
			} catch (Exception e) {
				System.out.println("Invalid Input ");
				System.out.println(e.getMessage());
			}
        }
       System.out.println("Thank You"); 
    }
}
