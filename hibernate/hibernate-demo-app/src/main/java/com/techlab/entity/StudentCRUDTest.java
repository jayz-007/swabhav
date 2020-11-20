package com.techlab.entity;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techlab.entity.Sstudent;

public class StudentCRUDTest {

	public static void main(String[] args) {
		Configuration config = new Configuration();
		SessionFactory factory = config.configure("hibernate.cfg.xml").buildSessionFactory();
		System.out.println(factory.getClass());

		Session session = factory.openSession();
		Transaction transaction = null;

		try {
			transaction = session.beginTransaction();
		//add(session, "jay", 9.6f);
			 delete(session, "78821649-607c-4e56-8b18-7888afc33be8");
			 //update(session, "78821649-607c-4e56-8b18-7888afc33be8", "jay", 9.8f);
			printInfo(read(session));

			transaction.commit();
		} catch (HibernateException ex) {
			transaction.rollback();
		} finally {
			session.close();
		}
		System.out.println("End");
	}

	private static void add(Session session, String name, float cgpa) {
		Sstudent s1 = new Sstudent();
		s1.setId();
		s1.setName(name);
		s1.setCgpa(cgpa);
		session.save(s1);
	}

	private static List<Sstudent> read(Session session) {
		List<Sstudent> students = new ArrayList<Sstudent>();
		students = session.createQuery("from Student").list();
		return students;
	}

	private static void delete(Session session, String id) {
		Sstudent student = (Sstudent) session.load(Sstudent.class, id);
		session.delete(student);
	}

	public static void update(Session session, String id, String name, float cgpa) {
		Sstudent student = (Sstudent) session.load(Sstudent.class, id);
		student.setName(name);
		student.setCgpa(cgpa);
		session.update(student);

	}

	private static void printInfo(List<Sstudent> students) {
		for (Sstudent student : students) {
			System.out
					.println("Id: " + student.getId() + " Name: " + student.getName() + " Cgpa: " + student.getCgpa());
		}
	}

}