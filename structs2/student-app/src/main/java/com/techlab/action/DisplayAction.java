package com.techlab.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.service.StudentService;
import com.teclab.model.Student;

public class DisplayAction implements Action, ModelDriven<StudentService> {

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return "success";
	}

	@Override
	public StudentService getModel() {
		StudentService ss = new StudentService().getInstance();
		return ss;

	}
}
