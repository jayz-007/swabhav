package com.techlabs.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import com.techlabs.model.Student;

public class StudentService {
	private static StudentService ed;
	private List<Student> students = new ArrayList<Student>();

	public StudentService() {
		students.add(new Student("Jay", "Developer"));
		students.add(new Student("Vinit", "Developer"));
		students.add(new Student("Pawan", "Analyst"));
		students.add(new Student("Prasad", "Tester"));
		students.add(new Student("Murtuza", "Manager"));
		System.out.println("inside service");
	}

	public void addEmployee(String name, String role) {
		students.add(new Student(name, role));
	}

	public List<Student> getStudents() {
		return students;
	}

	public Student getStudentByid(String id) {
		for (Student student : students) {
			if (student.getId().toString().equals(id)) {
				return student;
			}
		}
		return null;

	}

	public static StudentService getInstance() {
		if (ed == null) {
			ed = new StudentService();
		}
		return ed;
	}

	public void updateStudent(String name, String role, String id) {
		for (Student student : students) {
			if (student.getId().toString().equals(id)) {
				student.setName(name);
				student.setRole(role);
			}
		}
	}

	public void deleteStudent(String id) {
		for (Student emp : students) {
			if (emp.getId().toString().equals(id)) {
				students.remove(emp);
				System.out.println();
			}
		}
	}
	
	public List<Student> searchByName(String name) {
		List<Student> students = new ArrayList<Student>();
		for(Student student : this.students) {
			if(student.getName().startsWith(name)) {
				students.add(student);
			}
		}
		return students;
	}
}