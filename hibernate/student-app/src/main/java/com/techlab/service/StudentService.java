package com.techlab.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.ArchUtils;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlab.entity.Student;
import com.techlab.repository.StudentRepositroy;
import com.techlab.viewmodel.UpdateVM;

@Service
public class StudentService {
	@Autowired
	private StudentRepositroy studentRepository;
	private static StudentService studentService;
	@Autowired
	private SessionFactory factory;

	

	public List<Student> getStudents() {
		System.out.println(studentRepository.getStudents().size());
		return studentRepository.getStudents();
	}

	public StudentService getInstance() {
		if (studentService == null) {
			System.out.println("new create");
			studentService = new StudentService();
		}
		return this.studentService;
	}

	public void addStudent(Student student) {
		studentRepository.getStudents().add(student);
		factory.getCurrentSession().save(student);

	}

	public void deleteStudent(String id) {
		for (Student s : studentRepository.getStudents()) {
			if (s.getId().equals(id)) {
				studentRepository.getStudents().remove(s);
				factory.getCurrentSession().delete(s);
				break;
			}
		}
	}

	public Student getStudentById(String id) {
		for (Student s : studentRepository.getStudents()) {
			if (s.getId().equals(id)) {
				return s;

			}
		}
		return null;

	}

	public void updateStudent(String id, String name, String gender, int rollno, int age, double cgpa) {
		for (Student s : studentRepository.getStudents()) {
			if (s.getId().equals(id)) {
				s.setName(name);
				s.setGender(gender);
				s.setAge(age);
				s.setRollno(rollno);
				s.setCgpa(cgpa);
				factory.getCurrentSession().update(s);
				System.out.println("update success");
			}
		}
	}

}
