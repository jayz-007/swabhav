package com.techlab.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.entity.Student;
import com.techlab.service.StudentService;
import com.techlab.viewmodel.UpdateVM;

public class UpdateAction implements Action, ModelDriven<UpdateVM> {
	private String updateStudent;
	private UpdateVM studentvm;
	private Student student;

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("exe");
		this.student = new StudentService().getInstance().getStudentById(updateStudent);
		System.out.println(student.getName()+" inside ex");
		getModel();
		return "success";
	}

	@Override
	public UpdateVM getModel() {
		studentvm = new UpdateVM();
		return studentvm;
	}

	public void setUpdateStudent(String id) {
		this.updateStudent = id;
		System.out.println(updateStudent);
	}
	
	public Student getStudent() {
		return student;
	}

	public String doUpdate() {
		System.out.println("inside do add");
		new StudentService().getInstance().updateStudent(updateStudent, studentvm.getName(), studentvm.getGender(),
				studentvm.getRollno(), studentvm.getAge(), studentvm.getCgpa());
		return "success";
	}

}
