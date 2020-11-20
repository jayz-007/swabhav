package com.techlab.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlab.entity.Student;
import com.techlab.service.StudentService;

public class DisplayStudentAction implements Action  {
	private List<Student> students;
	@Autowired
	StudentService studentService;
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		students=studentService.getStudents();
		return "success";
	}
	public List<Student> getStudents(){
		return students;
	}
	
	public void setStudents(List<Student> students) {
		this.students = students;
	}

}