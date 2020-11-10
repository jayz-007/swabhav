package com.techlab.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.service.StudentService;
import com.teclab.model.Student;

public class AddAction implements Action, ModelDriven<Student> {
	Student student = new Student("", "",0,0,0);
	private String message;

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		if (doValidation()) {
			StudentService ss = new StudentService().getInstance();
			ss.addStudent(student);
			return "success";
		}
		return "failure";
	}

	@Override
	public Student getModel() {
		// TODO Auto-generated method stub
		return student;
	}

	public boolean doValidation() {
		System.out.println(student.getName()+" "+student.getGender());
		if (student.getName().equals("")) {
			this.message = "Enter name";
			return false;
		}
		if (student.getGender().equals("")) {
			this.message = "Enter gender";
			return false;
		}
		if(student.getAge().equals("") ) {
			this.message="Enter age";
		}
		if(student.getCgpa().equals("")) {
			this.message="Enter cgpa";
		}
		if(student.getRollno().equals("")) {
			this.message="Enter rollno";
		}

		return true;
	}

	public String getMessage() {
		return message;
	}

}
