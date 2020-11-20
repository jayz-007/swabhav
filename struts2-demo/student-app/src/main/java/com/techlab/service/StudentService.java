package com.techlab.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.ArchUtils;

import com.techlab.model.Student;
import com.techlab.viewmodel.UpdateVM;

public class StudentService {
	private List<Student> students = new ArrayList<Student>();
	private static StudentService studentService;

	public StudentService() {
		
		students.add(new Student("jay", "male",21,22,9.8));
		students.add(new Student("vinit", "male",12,22,8.91));
		students.add(new Student("pawan", "male",23,22,9.2));
		students.add(new Student("murtuza", "male",16,22,9.4));
		students.add(new Student("prasad", "male",10,22,8.9));
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
				students.remove(s);
				break;
			}
		}
	}
	
	public Student getStudentById(String id) {
		for(Student s: students) {
			if(s.getId().equals(id)) {
			return s;
			
			}
		}
		return null;
		
	}
	
	public void updateStudent(String id,String name,String gender,int rollno,int age,double cgpa) {
		for(Student s : students) {
			if(s.getId().equals(id)) {
				s.setName(name);
				s.setGender(gender);
				s.setAge(age);
				s.setRollno(rollno);
				s.setCgpa(cgpa);
				System.out.println("update success");
			}
		}
	}

}
