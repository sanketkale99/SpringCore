package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entity.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		StudentDao studentDao = context.getBean("StudentDao", StudentDao.class);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		boolean flag = true;
		while (flag) {
			System.out.println("1-Add new student");
			System.out.println("2-Display All stundent");
			System.out.println("3-Display one student");
			System.out.println("4-Delete student");
			System.out.println("5-Update student");
			System.out.println("6-Exit");

			try {
				int input = Integer.parseInt(br.readLine());

				switch (input) {
				case 1:// add new student
					System.out.println("Enter stuent id : ");
					int id = Integer.parseInt(br.readLine());
					System.out.println("Enter user name : ");
					String uname = br.readLine();
					System.out.println("Enter student city  : ");
					String ucity = br.readLine();

					Student s = new Student();
					s.setStudId(id);
					s.setStudName(uname);
					s.setStudCity(ucity);

					int r = studentDao.insert(s);
					System.out.println(r + " student added...");
					System.out.println("_____________________________________");
					break;

				case 2:// display all
					List<Student> list = studentDao.getallStudent();
					for (Student s1 : list) {
						System.out.println("Id : " + s1.getStudId());
						System.out.println("Name : " + s1.getStudName());
						System.out.println("City : " + s1.getStudCity());
						System.out.println("------------------------------------------");
					}
					System.out.println("_____________________________________");
					break;
				case 3: // display single
					System.out.println("Enter user id to search : ");
					int sid = Integer.parseInt(br.readLine());
					Student student = studentDao.getStudent(sid);
					System.out.println("Id : " + student.getStudId());
					System.out.println("Name : " + student.getStudName());
					System.out.println("City : " + student.getStudCity());
					System.out.println("_____________________________________");
					break;
				case 4:// delete record
					System.out.println("Enter user id to search : ");
					int studentid = Integer.parseInt(br.readLine());
					studentDao.deleteStudent(studentid);
					System.out.println("Student deleted with id {" + studentid + "}");
					System.out.println("_____________________________________");
					break;

				case 5:// update record
					System.out.println("Enter user id to update record : ");
					int studid = Integer.parseInt(br.readLine());

					Student studentToUpdate = studentDao.getStudent(studid);
					 if (studentToUpdate != null) {
						System.out.println("Enter new user name : ");
						String newName = br.readLine();
						System.out.println("Enter new student city  : ");
						String newCity = br.readLine();

						studentToUpdate.setStudName(newName);
						studentToUpdate.setStudCity(newCity);

						studentDao.updateStudent(studentToUpdate);
					} else {
						System.out.println("Student not found with id {" + studid + "}");
					}
					System.out.println("_____________________________________");
					break;

				case 6:// exit
					flag = false;
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
