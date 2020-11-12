package com.techlab.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.service.EmployeeService;

public class DisplayAction implements Action,ModelDriven<EmployeeService> {
private EmployeeService employeeService;
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return "success";
	}

	@Override
	public EmployeeService getModel() {
		// TODO Auto-generated method stub
		this.employeeService = new EmployeeService().getInstance();
		System.out.println(employeeService);
		return employeeService;
	}

}
