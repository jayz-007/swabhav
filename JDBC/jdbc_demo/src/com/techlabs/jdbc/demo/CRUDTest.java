package com.techlabs.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CRUDTest {
	public static void main(String args[]) throws SQLException {
		String driver = "com.mysql.jdbc.Driver";
		String dbUrl = "jdbc:mysql://localhost:3306/swabhav?user=root&password=root";
		String query = "select * from studenttriggdemo";
		String insertQuery = "insert into studenttriggdemo (name,marks)\r\n" + "values(\"InsertTest\",100)";
		String deleteQuery = "delete from studenttriggdemo where name = \"UpdateTest\" ";
		String updateQuery = "update studenttriggdemo set name =\"UpdateTest\" where name = \"InsertTest\"";
		
		System.out.println("before insert");
		doConnectionOperation(driver, dbUrl, query);
		
		System.out.println();
		System.out.println("After Insert");
		doInsertionOperation(driver, dbUrl, insertQuery);
		doConnectionOperation(driver, dbUrl, query);
		
		System.out.println();
		System.out.println("After updating inserted query");
		doUpdationOperation(driver, dbUrl, updateQuery);
		doConnectionOperation(driver, dbUrl, query);
		
		System.out.println();
		doDeletionOperation(driver, dbUrl, deleteQuery);
		System.out.println("after deleting updated row");
		doConnectionOperation(driver, dbUrl, query);
	

	}

	public static void doConnectionOperation(String driver, String dbUrl, String query) throws SQLException {
		Connection connection = null;
		try {
			Class.forName(driver);

			connection = DriverManager.getConnection(dbUrl);

			java.sql.Statement stmt = connection.createStatement();

			ResultSet rs = stmt.executeQuery(query);

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

	public static void doDeletionOperation(String driver, String dbUrl, String query) throws SQLException {
		Connection connection = null;
		try {
			Class.forName(driver);

			connection = DriverManager.getConnection(dbUrl);

			java.sql.Statement stmt = connection.createStatement();
			int rows = stmt.executeUpdate(query);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			connection.close();
		}
	}
	
	public static void doInsertionOperation(String driver, String dbUrl, String query) throws SQLException {
		Connection connection = null;
		try {
			Class.forName(driver);

			connection = DriverManager.getConnection(dbUrl);

			java.sql.Statement stmt = connection.createStatement();
			int rows = stmt.executeUpdate(query);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			connection.close();
		}
	}
	
	public static void doUpdationOperation(String driver, String dbUrl, String query) throws SQLException {
		Connection connection = null;
		try {
			Class.forName(driver);

			connection = DriverManager.getConnection(dbUrl);

			java.sql.Statement stmt = connection.createStatement();
			int rows = stmt.executeUpdate(query);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			connection.close();
		}
	}

}
