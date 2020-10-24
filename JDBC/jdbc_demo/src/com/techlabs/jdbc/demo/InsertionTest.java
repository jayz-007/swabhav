package com.techlabs.jdbc.demo;

import java.sql.*;

public class InsertionTest {
	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?user=root&password=root");

			java.sql.Statement stmt = connection.createStatement();
			int rows = stmt
					.executeUpdate("insert into studenttriggdemo (name,marks)\r\n" + "values(\"nsertTest\",100)");

			ResultSet rs = stmt.executeQuery("select * from studenttriggdemo");

			while (rs.next()) {
				System.out.println(rs.getString(1) + " " + rs.getInt(2));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			connection.close();
		}

	}

}
