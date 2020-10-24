package com.techlabs.jdbc.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

public class ReadWriteIntoFileDB {
	public static void main(String args[]) throws SQLException, IOException, ClassNotFoundException {
		readWriteintoFile("person.txt");

	}

	public static void readWriteintoFile(String filename)
			throws SQLException, IOException, ClassNotFoundException {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?user=root&password=root");

			java.sql.Statement stmt = connection.createStatement();

			ResultSet rs = stmt.executeQuery("select * from person");
			Writer writer;
			File file = new File(filename);
			writer = new FileWriter(file);
			while (rs.next()) {
				
				writer.write(rs.getInt(1) + ";" + checkEmptyfield(rs.getString(2)) + ";" + checkEmptyfield(rs.getInt(3)) + ";" + checkEmptyfield(rs.getString(4)) + "\n");
			}
			writer.close();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			System.out.println();
			connection.close();

		}

	}
	public static String checkEmptyfield(String field) {
		
		if(field == null) {
			return "empty";
		}
		return field;
	}
	
	public static int checkEmptyfield(Integer field) {

		if(field.toString() == null) {
			return 0;
		}
		return field;
	}


	
}
