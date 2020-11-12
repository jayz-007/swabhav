package com.techlab.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlab.model.Student;
import com.techlab.repository.StudentRepository;

@Service("studentsvc")
public class StudentService {
	@Autowired
	private StudentRepository studentRepository;

	public StudentService() {
		System.out.println("Student servce invoked");
		// TODO Auto-generated constructor stub
	}

	public List<Student> getRepository() {
		return studentRepository.getStudents();
	}
}
