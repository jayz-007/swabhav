package com.techlab.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techlab.entity.Student;

@Repository
@Transactional
public class StudentRepository {
	@Autowired
	private SessionFactory factory;

	private List<Student> students = new ArrayList<Student>();

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

	public void deleteStudent(String id) {
		Student currentStudent = searchStudent(id);

		// students.remove(studentInfo);
		factory.getCurrentSession().delete(currentStudent);
	}

	public void addStudent(String name, String gender) {
		factory.getCurrentSession().save(new Student(UUID.randomUUID().toString(), name, gender));

	}

	public Student searchStudent(String id) {
		getStudents();
		for (Student studentInfo : students) {
			if (studentInfo.getId().toString().equals(id)) {

				return studentInfo;

			}
		}
		return null;
	}

	public void updateStudent(Student studentUpdateInfo) {
		Student currentStudent = searchStudent(studentUpdateInfo.getId());
		currentStudent.setName(studentUpdateInfo.getName());
		currentStudent.setGender(studentUpdateInfo.getGender());
		factory.getCurrentSession().update(currentStudent);
		
		System.out.println(studentUpdateInfo.getGender());
		for (Student studentInfo : students) {
			if (studentInfo.getId().toString().equals(studentUpdateInfo.getId().toString())) {

				studentInfo.setGender(studentUpdateInfo.getGender());
				studentInfo.setName(studentUpdateInfo.getName());
			}
		}
	}

}
