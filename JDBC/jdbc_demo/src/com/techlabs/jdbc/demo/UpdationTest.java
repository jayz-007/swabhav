package com.techlabs.jdbc.demo;

import java.sql.*;

public class UpdationTest {
	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?user=root&password=root");

			java.sql.Statement stmt = connection.createStatement();

			ResultSet rs = stmt.executeQuery("select * from studenttriggdemo");

			System.out.println("Before Update");
			while (rs.next()) {
				System.out.println(rs.getString(1) + " " + rs.getInt(2));
			}

			
			int rows = stmt
					.executeUpdate("update studenttriggdemo set name =\"UpdateTest\" where name = \"nsertTest\"");

			rs = stmt.executeQuery("select * from studenttriggdemo");
			
			System.out.println();
			System.out.println("After Update");
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
