package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.entity.Student;

@Component("studentDao") 	//bean created with studentDao name so that we can fetch it in App.java class
public class StudentDaoImpl implements StudentDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	//insert data
	public int insert(Student student) {
		String query="insert into student values(?,?,?)";
		int r=this.jdbcTemplate.update(query, student.getId(),student.getName(),student.getCity());
		return r;
	}
	
	//updating data
	public int update(Student student) {
		String query="update student set name=?, city=? where id=?";
		int result = this.jdbcTemplate.update(query, student.getName(),student.getCity(),student.getId());
		return result;
	}
	
	//delete data
	public int delete(int sId) {
		String query="delete from student where id=?";
		int r = this.jdbcTemplate.update(query,sId );
		return r;
	}
	
	//row mapper for retriving single row
	public Student getStudent(int studId) {
		String query="select * from student where id=?";
		RowMapper<Student> rowMapper=new RowMapperImpl();
		
		Student student = this.jdbcTemplate.queryForObject(query, rowMapper, studId);
		return student;
	}
	
	//row mapper for retriving multiple rows
	public List<Student> getAllStudent() {
		String query="select * from student";
		List<Student> students = this.jdbcTemplate.query(query, new RowMapperImpl());
		return students;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	

	

}
