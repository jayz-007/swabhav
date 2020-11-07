package com.techlabs.databse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.techlabs.model.Student;
import com.techlabs.service.StudentService;

public class StudentCrud {
	
	
	public  List<Student>  getAllStudents() {
		List<Student> student = new ArrayList<Student>();
		 Connection conn = null;
		 Statement stmt = null;
		 ResultSet res = null;
		
		try {

			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?user=root&password=root");
			stmt = conn.createStatement();
			res = stmt.executeQuery("Select * from student_jsp");
			
			while (res.next()) {
				System.out.println(res.getInt(1)+res.getString(2)+res.getString(3));
				
				student.add(new Student(res.getInt(1),res.getString(2),res.getString(3)));
			}
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return student;
	}
	
	public void updateStudent(int id,String name,String gender)  {
		Connection conn = null;
		 Statement stmt = null;
		 ResultSet res = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?user=root&password=root");
			stmt = conn.createStatement();
			int rows = stmt.executeUpdate("update student_jsp set name='"+ name+"',gender='"+ gender+"' where id="+ id);	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void insertStudent(String name,String gender) {
		Connection conn = null;
		 Statement stmt = null;
		 ResultSet res = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?user=root&password=root");
			stmt = conn.createStatement();
			System.out.println("in insert stmt");
			int rows = stmt.executeUpdate("insert into student_jsp(name,gender) values('"+name+"','"+gender+"')");
						conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public Student getStudentUsingId(int id) {
		 Connection conn = null;
		 Statement stmt = null;
		 ResultSet res = null;
		
		try {

			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?user=root&password=root");
			stmt = conn.createStatement();
			res = stmt.executeQuery("Select * from student_jsp where id='"+id+"'");
			
			while (res.next()) {
				System.out.println(res.getInt(1)+res.getString(2)+res.getString(3));
				return new Student(res.getInt(1), res.getString(2),res.getString(3));
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
	
	public void deleteStudent(int id) {
		Connection conn = null;
		 Statement stmt = null;
		 ResultSet res = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?user=root&password=root");
			stmt = conn.createStatement();
			System.out.println("In delete crud");
			int rows = stmt.executeUpdate("delete from student_jsp where id ='"+id+"'");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
}
