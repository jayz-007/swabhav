  
package com.techlab.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techlab.entity.Aaddress;
import com.techlab.entity.Peerson;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		SessionFactory sessionFactory = cfg.configure().buildSessionFactory();
		Session session = null;
		Transaction transaction = null;

		try {
			session = sessionFactory.openSession();
			/*Peerson jay = new Peerson();
			jay.setId(1);
			jay.setName("abc");
			Aaddress address = new Aaddress();
			address.setId(101);
			address.setCity("Mumbai");
			address.setCountry("India");
			jay.setAddress(address);
			address.setPerson(jay);
			transaction = session.beginTransaction();
			session.persist(address);
			*/
			
			Peerson person = (Peerson) session.load(Peerson.class, 1);
			session.delete(person);
			transaction.commit();
		} catch (Exception ex) {
			if (transaction != null) {
				transaction.rollback();
			}

		} finally {
			System.out.println("end");
			if (session.isOpen())
				session.close();
		}
	}

}
