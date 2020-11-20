package com.techlab.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techlab.entity.Student;
@Repository
public class StudentRepositroy {
	@Autowired
	private SessionFactory factory;
	private List<Student> students = new ArrayList<Student>();

	public StudentRepositroy() {
		// TODO Auto-generated constructor stub
		/*students.add(new Studentdemo("jay", "male", 21, 22, 9.8));
		students.add(new Studentdemo("vinit", "male", 12, 22, 8.91));
		students.add(new Studentdemo("pawan", "male", 23, 22, 9.2));
		students.add(new Studentdemo("murtuza", "male", 16, 22, 9.4));
		students.add(new Studentdemo("prasad", "male", 10, 22, 8.9));*/
	}
	public List<Student> getStudents() {
		Session session = factory.openSession();
		try {
			students = session.createQuery("from Student").list();
		} catch (HibernateException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			session.close();
		}

		return students;
	}
	
	


	
/*
	public void updateStudent(Student studentUpdateInfo) {
		Student currentStudent = searchStudent(studentUpdateInfo.getId());
		currentStudent.setName(studentUpdateInfo.getName());
		currentStudent.setGender(studentUpdateInfo.getGender());
		
		
		System.out.println(studentUpdateInfo.getGender());
		for (Student studentInfo : students) {
			if (studentInfo.getId().toString().equals(studentUpdateInfo.getId().toString())) {

				studentInfo.setGender(studentUpdateInfo.getGender());
				studentInfo.setName(studentUpdateInfo.getName());
			}
		}
	}*/
}
