package com.techlab.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlab.entity.Student;
import com.techlab.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	public List<Student> getStudents() {
		return studentRepository.getStudents();
	}

	public void deleteStudent(String id) {
		studentRepository.deleteStudent(id);
	}

	public void addStudent(String name, String gender) {
		studentRepository.addStudent(name, gender);
	}

	public Student searchStudent(String id) {
		return studentRepository.searchStudent(id);
	}
	
	public void updateStudent(Student studentUpdateInfo) {
		studentRepository.updateStudent(studentUpdateInfo);
	}
}
