package com.techlabs.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class Employee implements Comparable<Employee> {
	private int empid;
	private String ename;
	private String role;
	private int managerid;
	private Date dob;
	private double salary;
	private double comm;
	private int deptno;

	public Employee(int empid, String ename, String role, int managerid, String dob, double salary, double comm,
			int deptno) throws ParseException {
		this.empid = empid;
		this.ename = ename;
		this.role = role;
		this.managerid = managerid;
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");

		this.dob = formatter.parse(dob);
		this.salary = salary;
		this.comm = comm;
		this.deptno = deptno;

	}

	

	public int getEmpId() {
		return empid;
	}

	public String getEname() {
		return ename;
	}

	public String getRole() {
		return role;

	}

	public int getManagerId() {
		return managerid;
	}

	public Date getDob() {
		return dob;

	}

	public double getSalary() {
		return salary;
	}

	public double getComm() {
		return comm;
	}

	public int getDeptNo() {
		return deptno;
	}

	@Override
	public int hashCode() {
		return this.empid;
	}

	@Override
	public boolean equals(Object obj) {
		Employee employee = (Employee) obj;

		return (employee.getRole() == this.role && employee.getManagerId() == this.managerid
				&& employee.getEmpId() == this.managerid && employee.getEname() == this.ename
				&& employee.getDob() == this.dob && employee.getSalary() == this.salary
				&& employee.getComm() == this.comm && employee.getDeptNo() == this.deptno);
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
