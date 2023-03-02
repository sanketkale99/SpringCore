package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entity.Student;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("hello JDBC...");
    	// this is for xml configuration 
       // ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        
    	//this is for java base configuration 
    	ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
        StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
        

//      JdbcTemplate template= (JdbcTemplate) context.getBean("jdbcTemplate");
//      System.out.println(template);
        
        
//      //insert query
//      String query="insert into student values(?,?,?)";
//      //fire query
//      int result = template.update(query, 11, "Aditya Ghyar", "Budhavar Peth");
//      System.out.println(result+ " Record Inserted");
      
        //insert new record
        /*
        Student student=new Student();
        student.setId(102);
        student.setName("Mayur Shinde");
        student.setCity("Nagar");
        int result = studentDao.insert(student);
        System.out.println(result+ "  Record inserted...");
         */
        
        //update record
        /*
        Student student=new Student();
        student.setId(100);
        student.setName("Abhishek Gavhane");
        student.setCity("Nagar");
        int result = studentDao.update(student);
        System.out.println(result+ "  Record updated...");
        */
        
        //delete data
        /*
        int r = studentDao.delete(100);
        System.out.println(r+ "Record deleted");
         */

        //rowmapper - return single row 
        /*
        Student student = studentDao.getStudent(11);
        System.out.println(student);
        */
        
        //rowmapper - return multiple rows
        List<Student> allStudent = studentDao.getAllStudent();
        for(Student s: allStudent)
        {        	
        	System.out.println(s);
        }
        
        
    }
}