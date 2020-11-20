package com.techlab.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techlab.entity.Address;
import com.techlab.entity.Person;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		SessionFactory sessionFactory = cfg.configure().buildSessionFactory();
		Session session = null;
		Transaction transaction = null;

		try {
			session = sessionFactory.openSession();
			Person sachin = new Person();
			sachin.setId(1);
			sachin.setName("Sachin");
			Address address = new Address();
			address.setId(101);
			address.setCity("Mumbai");
			address.setCountry("India");
			sachin.setAddress(address);
			address.setPerson(sachin);
			transaction = session.beginTransaction();
			session.persist(address);
			transaction.commit();
		} catch (Exception ex) {
			if (transaction != null) {
				transaction.rollback();
			}

		} finally {
			if (session.isOpen())
				session.close();
		}
	}

}