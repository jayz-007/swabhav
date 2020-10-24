package com.techlabs.jdbc.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

public class writeIntoDBTTest {
	public static void main(String args[]) throws SQLException, IOException, ClassNotFoundException {
		writeCSVFileToDB();

	}

	public static void writeCSVFileToDB() throws SQLException, IOException, ClassNotFoundException {
		Connection connection = null;

		String line = "";
		String splitBy = ",";

		try {
			Class.forName("com.mysql.jdbc.Driver");

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?user=root&password=root");

			java.sql.Statement stmt = connection.createStatement();

			BufferedReader br = new BufferedReader(new FileReader("studentDemo.csv"));
			while ((line = br.readLine()) != null) {
				String[] student = line.split(splitBy);

				int rows = stmt.executeUpdate("insert into studenttriggdemo (name,marks)\r\n" + "values(\"" + student[0]
						+ "\"," + Integer.parseInt(student[1]) + ")");
				
			}

			ResultSet rs = stmt.executeQuery("select * from studenttriggdemo");

			while (rs.next()) {
				System.out.println(rs.getString(1) + " " + rs.getInt(2));
			}
		} catch (Exception e ) {
			// TODO: handle exception
			System.out.println(e.getLocalizedMessage());
			
		} finally {
			connection.close();
		}

	}
}
