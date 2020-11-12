package com.techlab.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.techlab.model.Employee;
import com.techlab.service.EmployeeService;

public class EmployeeAction extends ActionSupport {
	private List<Employee> employees;
	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String execute() {
		employees = EmployeeService.getInstance().getEmployees();
		return "success";
	}
}