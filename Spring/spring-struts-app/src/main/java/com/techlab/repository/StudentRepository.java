package com.techlab.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.techlab.model.Student;

@Repository
public class StudentRepository {

	private List<Student> students;

	public StudentRepository() {
		System.out.println("Inside Student Repository");
		students = new ArrayList<Student>();
		Student s1 = new Student();
		Student s2 = new Student();
		s1.setName("sachin");
		s1.setRollno(1);
		s2.setName("rohit");
		s2.setRollno(2);
		students.add(s1);
		students.add(s2);
	}

	public List<Student> getStudents() {
		return students;
	}
}