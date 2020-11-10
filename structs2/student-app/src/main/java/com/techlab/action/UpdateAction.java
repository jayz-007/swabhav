package com.techlab.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.service.StudentService;
import com.teclab.model.Student;

public class UpdateAction implements Action, ModelDriven<Student> {
	private String updateStudent;
	private Student student;
	private String updatedName, updatedGender;
	private int updatedAge, updateRollno;
	private double updatedCgpa;;

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		this.student = new StudentService().getInstance().getStudentById(updateStudent);

		return "success";
	}

	@Override
	public Student getModel() {
		student = new Student("", "", 0, 0, 0);
		return student;
	}

	public void setUpdateStudent(String id) {
		this.updateStudent = id;
		System.out.println(updateStudent);
	}

	public Student getStudent() {
		return student;
	}

	public void setUpdatedName(String name) {
		this.updatedName = name;
	}

	public void setUpdatedGender(String gender) {
		this.updatedGender = gender;
	}

	public void setUpdatedAge(int age) {
		this.updatedAge = age;
	}

	public void setUpdatedRollno(int rollno) {
		this.updateRollno = rollno;
	}

	public void setUpdatedCgpa(double cgpa) {
		this.updatedCgpa = cgpa;
	}

	public String doUpdate() {
		new StudentService().getInstance().updateStudent(updateStudent, updatedName, updatedGender, updateRollno,
				updatedAge, updatedCgpa);
		return "success";
	}

}
