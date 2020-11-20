package com.techlab.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.techlab.model.Student;
@Repository
public class StudentRepositroy {
	private List<Student> students = new ArrayList<Student>();

	public StudentRepositroy() {
		// TODO Auto-generated constructor stub
		students.add(new Student("jay", "male", 21, 22, 9.8));
		students.add(new Student("vinit", "male", 12, 22, 8.91));
		students.add(new Student("pawan", "male", 23, 22, 9.2));
		students.add(new Student("murtuza", "male", 16, 22, 9.4));
		students.add(new Student("prasad", "male", 10, 22, 8.9));
	}
	
	public List<Student> getStudents(){
		return students;
	}
}
