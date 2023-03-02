package com.spring.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entity.Student;

public class StudentDao {
	
	private HibernateTemplate hibernateTemplate;
	
	@Transactional		//  to enable write operation; to use this annotation configure <tx:annotation /> in XML file
	public int insert(Student student)
	{
		Integer i=(Integer) hibernateTemplate.save(student);
		return i;
	}
	
	//get single data(object)
	public Student getStudent(int id)
	{
		// hibernate having 2 method to fetch record from db  : get()- if record not found then return null  and  load()-if record not found then return proxy object
		Student student = this.hibernateTemplate.get(Student.class,id);
		return student;
	}
	//get all records
	public List<Student> getallStudent(){
		
		List<Student> students = this.hibernateTemplate.loadAll(Student.class);
		return students;
	}
	
	//delete record
	@Transactional
	public void deleteStudent(int id)
	{
		Student student = this.hibernateTemplate.get(Student.class, id);
		this.hibernateTemplate.delete(student);
	}

	//update record 
	@Transactional
	public void updateStudent(Student student)
	{
		this.hibernateTemplate.update(student);
	}
	
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
	
}
