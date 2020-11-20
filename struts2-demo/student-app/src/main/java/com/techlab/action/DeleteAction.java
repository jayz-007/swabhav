package com.techlab.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.model.Student;
import com.techlab.service.StudentService;

public class DeleteAction implements Action,ModelDriven<Student> {
	private Student s = new Student("", "",0,0,0);
	private String deleteStudent;

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		StudentService ss = new StudentService().getInstance();
		ss.deleteStudent(deleteStudent);
		return "success";
	}



	@Override
	public Student getModel() {
		// TODO Auto-generated method stub
		return s;
	}
	
	public void setDeleteStudent(String id) {
		this.deleteStudent = id;
		
	}
	
	public boolean validate() {
		return true;
	}

}
