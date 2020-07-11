package com.techlabs.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

public class Employee {
	private int empId;
	private String empName;
	private String designation;
	private int managerId;
	private Date joiningDate;
	private int salary;
	private int comm;
	private int deptId;
	private Set<Employee> employees = new TreeSet<Employee>(new IDComparator());

	public Employee(int empId, String empName, String Designation, int managerId, String joiningDate, int salary,
			int comm, int deptId) throws ParseException {
		this.empId = empId;
		this.empName = empName;
		this.designation = Designation;
		this.managerId = managerId;
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
		this.joiningDate = (Date) dateFormat.parse(joiningDate);
		this.salary = salary;
		this.comm = comm;
		this.deptId = deptId;
	}

	public void addReferralEmployee(Employee employee) {
		employees.add(employee);
	}

	public String showXML(int index) {
		String details = "<"+empName+">";
		for (Employee employee : employees) {
			details += "\n" + addSpaces(index)  + employee.showXML(index + 1);
		}
		details += "\n"+addSpaces(index-1)+"</"+empName+">";
		return details;
	}
	
	public String show(int index) {
		String details = empName + "-(" + designation + ")";
		for (Employee employee : employees) {
			details += "\n" + addSpaces(index) + "|->" + employee.show(index + 1);
		}
	
		return details;
	}
	

	private String addSpaces(int index) {
		String spacing = "";
		for (int i = 0; i <= index; i++) {
			spacing += "  ";
		}
		return spacing;
	}

	public int getEmployeeId() {
		return empId;
	}

	public String getEmployeeName() {
		return empName;
	}

	public String getDesignation() {
		return designation;
	}

	public int getManagerId() {
		return managerId;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public int getSalary() {
		return salary;
	}

	public int getComm() {
		return comm;
	}

	public int getDeptId() {
		return deptId;
	}
	
	public Set<Employee> getEmployee(){
		return employees;
	}

}