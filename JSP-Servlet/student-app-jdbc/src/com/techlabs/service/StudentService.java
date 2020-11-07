package com.techlabs.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.techlabs.databse.StudentCrud;
import com.techlabs.model.Student;

public class StudentService {
	private List<Student> students = new ArrayList<Student>();
	private static StudentService instance = new StudentService();
	private Student student;
	private StudentCrud studentCRUD;
	public StudentService() {
		// TODO Auto-generated constructor stub
		System.out.println("ss contstr");
		studentCRUD = new StudentCrud();	
	}
	
	public void addStudent(String name,String gender) {
		//students.add(new Student(id, name, gender));
		System.out.println("in studentService add");
		studentCRUD.insertStudent(name, gender);
		
	}
	public List<Student> getStudents() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
		for (Student student : studentCRUD.getAllStudents()) {
			System.out.println(student.getId());
		}
		
		return studentCRUD.getAllStudents();
		
	}
	public Student getStudentUsingId(String id) {
		return studentCRUD.getStudentUsingId(Integer.parseInt(id));
	}
	public void updateStudent(String id,String name,String gender) {
		studentCRUD.updateStudent(Integer.parseInt(id), name, gender);
		
	}
	public void deleteStudent(String id) {
		System.out.println("In delete Service");
		studentCRUD.deleteStudent(Integer.parseInt(id));
	}
	
	
	public static StudentService getInstance(){
	      return instance;
	   }
}
