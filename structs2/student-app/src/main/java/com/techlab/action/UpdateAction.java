package com.techlab.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.service.StudentService;
import com.teclab.model.Student;

public class UpdateAction implements Action,ModelDriven<Student>{
	private String updateStudent;
	private Student s ;
	

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("redirect");
		getModel();
	System.out.println(hi);
		return "success";
	}

	@Override
	public Student getModel() {
		// TODO Auto-generated method stub
		this.s = new StudentService().getInstance().getStudentById(updateStudent);
		return s;
	}
	
	public void setUpdateStudent(String id) {
		this.updateStudent = id;
	}
}
