package com.techlabs.model.project2;

import java.sql.*;

public class Contact {
	private static Statement stmt = null;
	private ResultSet rs = null;
	private Connection conn = null;

	private void createConnection() throws SQLException {
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?user=root&password=root");
		stmt = conn.createStatement();
	}

	public void display() throws SQLException {
		createConnection();

		rs = stmt.executeQuery("select * from contact");
		while (rs.next()) {
			System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
		}
		conn.close();

	}

	public void addContact(String fname, String lastname, String phone, String email) throws SQLException {
		createConnection();

		stmt.executeUpdate("insert into contact (fname,lname,phone,email) values (\"" + fname + "\",\"" + lastname
				+ "\",\"" + phone + "\",\"" + email + "\")");
		conn.close();

	}

	public void delete(String fname) throws SQLException {
		createConnection();
		stmt.executeUpdate("Delete from contact where fname = \"" + fname + "\"");
		conn.close();

	}
}
