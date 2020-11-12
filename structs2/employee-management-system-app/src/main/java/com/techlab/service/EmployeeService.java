package com.techlab.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.techlab.model.Employee;

public class EmployeeService {
	private List<Employee> employeeRepository = new ArrayList<Employee>();
	private static EmployeeService employeeService;

	public EmployeeService() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet res = null;

		try {

			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?user=root&password=root");
			stmt = conn.createStatement();
			res = stmt.executeQuery("select * from emp_struts");

			while (res.next()) {

				employeeRepository.add(new Employee(res.getInt(1), res.getString(2), res.getString(3), res.getDouble(4),
						res.getInt(5), res.getFloat(6)));
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

	public EmployeeService getInstance() {
		if (this.employeeService == null) {
			employeeService = new EmployeeService();
		}
		return employeeService;
	}

	public List<Employee> getEmployeeRepository() {
		return employeeRepository;
	}

}
