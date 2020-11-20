package com.techlab.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.model.Student;
import com.techlab.service.AddVM;
import com.techlab.service.StudentService;
import com.techlab.viewmodel.AddStudentVM;

public class AddAction implements Action, ModelDriven<AddStudentVM> {
	private AddStudentVM addStudent = new AddStudentVM();
	private String message;

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		
		return "succcess";
	}

	@Override
	public AddStudentVM getModel() {
		// TODO Auto-generated method stub
		return addStudent;
	}
	
	public String doAdd() {
		if (doValidation()) {
			StudentService ss = new StudentService().getInstance();
			ss.addStudent(new Student(addStudent.getName(), addStudent.getGender(), addStudent.getRollno(), addStudent.getAge(), addStudent.getCgpa()));
			return "success";
		}
		return null;
	}

	public boolean doValidation() {
		System.out.println(addStudent.getName() + " " + addStudent.getGender());
		if (addStudent.getName().equals("")) {
			this.message = "Enter name";
			return false;
		}
		if (addStudent.getGender().equals("")) {
			this.message = "Enter gender";
			return false;
		}
		if (String.valueOf(addStudent.getAge()).equals("")) {
			this.message = "Enter age";
		}
		if (String.valueOf(addStudent.getCgpa()).equals("")) {
			this.message = "Enter cgpa";
		}
		if (String.valueOf(addStudent.getRollno()).equals("")) {
			this.message = "Enter rollno";
		}

		return true;
	}

	public String getMessage() {
		return message;
	}

}
