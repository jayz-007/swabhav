package com.techlab.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.model.Student;
import com.techlab.service.StudentService;

public class DisplayAction implements Action {
	@Autowired
	private StudentService ss;
	
	private List<Student> students;

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		this.students = ss.getStudents();
		return "success";
	}
	
	public List<Student> getStudents(){
		return students;
	}


}
