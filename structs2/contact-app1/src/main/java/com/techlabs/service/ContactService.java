package com.techlabs.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.techlabs.model.Contact;

public class ContactService {
	private static ContactService instance;

	private ContactService() {
		System.out.println("Inside Contact Service");
	}

	public static ContactService getInstance() {
		if (instance == null) {
			instance = new ContactService();
		}
		return instance;
	}

	public List<Contact> getAllContacts() {
		List<Contact> contacts = new ArrayList<Contact>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet res = null;

		try {

			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?user=root&password=root");
			stmt = conn.createStatement();
			res = stmt.executeQuery("Select * from contact");

			while (res.next()) {
				System.out.println(res.getString(1) + res.getString(2) + res.getString(3) + res.getString(4));

				contacts.add(new Contact(res.getString(1), res.getString(2), res.getString(3), res.getString(4)));
			}
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void updateContact(String fname, String lname, String phone, String email) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet res = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?user=root&password=root");
			stmt = conn.createStatement();
			int rows = stmt.executeUpdate(
					"update contact set phone='" + phone + "',emailid='" + email + "' where fname='" + fname + "'");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void insertContact(String fname, String lname, String phone, String email) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet res = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?user=root&password=root");
			stmt = conn.createStatement();
			System.out.println("Inside Insert");
			int rows = stmt.executeUpdate(
					"insert into contact values('" + fname + "','" + lname + "','" + phone + "','" + email + "')");
			conn.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public Contact getContactByFname(String fname) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet res = null;

		try {

			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?user=root&password=root");
			stmt = conn.createStatement();
			res = stmt.executeQuery("Select * from contact where fname='" + fname + "'");

			while (res.next()) {
				System.out.println(res.getString(1) + res.getString(2) + res.getString(3) + res.getString(4));
				return new Contact(res.getString(1), res.getString(2), res.getString(3), res.getString(4));
			}

			conn.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public void deleteContact(String fname) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet res = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?user=root&password=root");
			stmt = conn.createStatement();
			System.out.println("Delete Contact");
			int rows = stmt.executeUpdate("delete from contact where fname ='" + fname + "'");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}