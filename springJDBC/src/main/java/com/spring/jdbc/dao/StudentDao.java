package com.spring.jdbc.dao;

import java.util.List;

import com.spring.jdbc.entity.Student;

public interface StudentDao {

	public int insert(Student student);
	public int update(Student student);
	public int delete(int sId);
	public Student getStudent(int studId);
	public List<Student> getAllStudent();
	
}
