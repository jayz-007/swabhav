package com.techlab.service;

import java.util.List;

import com.teclab.model.Student;

public class AddVM {
	private StudentService ss;
	private Student student;

	public AddVM() {
		this.ss = new StudentService().getInstance();
		this.student = new Student("", "", 0, 0, 0);
	}
	
	public Student getStudent() {
		return this.student;
	}
	
	public StudentService getStudentService() {
		return ss;
	}
	
	public void addStudent(Student addStuydent) {
		List<Student> students = ss.getStudents();
		students.add(addStuydent);
		System.out.println("done");
	}
	
	

}
