package com.techlab.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.ArchUtils;

import com.teclab.model.Student;

public class StudentService {
	private List<Student> students = new ArrayList<Student>();
	private static StudentService studentService;

	public StudentService() {
		
		students.add(new Student("jay", "male"));
		students.add(new Student("vinit", "male"));
		students.add(new Student("pawan", "male"));
		students.add(new Student("murtuza", "male"));
		students.add(new Student("prasad", "male"));
	}

	public List<Student> getStudents() {
		return students;
	}

	public StudentService getInstance() {
		if (studentService == null) {
			System.out.println("new create");
			studentService = new StudentService();
		}
		return this.studentService;
	}
	
	public void addStudent(Student student) {
		students.add(student);
	}
	
	public void deleteStudent(String id) {
		for(Student s: students) {
			if(s.getId().equals(id)) {
				System.out.println("deleted");
				students.remove(s);
			}
		}
	}
	
	public Student getStudentById(String id) {
		for(Student s: students) {
			if(s.getId().equals(id)) {
				System.out.println("deleted");
				return s;
			}
		}
		return null;
		
	}
	
	public void updateStudent(String id,String name,String gender) {
		for(Student s : students) {
			if(s.getId().equals(id)) {
				s.setName(name);
				s.setGender(gender);
			}
		}
	}

}
