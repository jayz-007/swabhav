package com.techlabs.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TansactionTest {
	public static void main(String args[]) throws SQLException, ClassNotFoundException {
		doTransaction();
	}

public static void doTransaction() throws SQLException, ClassNotFoundException {
	Connection connection = null;
	connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?user=root&password=root");
	try {
		
        
		java.sql.Statement stmt = connection.createStatement();
		connection.setAutoCommit(false);
		int value = 500;
		stmt.executeUpdate("update customertransaction set balance =balance-"+value+" where name = \"jay\"");
		stmt.executeUpdate("update mercahant set balance =balance+"+value+" where name = \"Dmart\"");
		connection.commit();
	
		

	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		connection.rollback();
	} finally {
		System.out.println("done");
		connection.close();
	}
}

}
