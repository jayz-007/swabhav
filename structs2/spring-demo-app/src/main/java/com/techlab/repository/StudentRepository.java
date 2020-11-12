package com.techlab.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.techlab.model.Student;

@Repository
public class StudentRepository {
	private List<Student> students = new ArrayList<Student>();
	
	public StudentRepository() {
		System.out.println("Student repo created");
		
		Student s1 = new Student();
		s1.setName("abc");
		s1.setRollno(2);
		
		Student s2 = new Student();
		s2.setName("xyz");
		s2.setRollno(3);
		
		students.add(s1);
		students.add(s2);
	}
	
	public List<Student> getStudents(){
		return students;
	}

}
