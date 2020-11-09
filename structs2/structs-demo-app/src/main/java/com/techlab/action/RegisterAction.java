package com.techlab.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.model.Register;

public class RegisterAction implements Action,ModelDriven<Register> {
	private Register registerUser = new Register();

	private String message;

	@Override
	public String execute() throws Exception {
		if(doValidation()!=null) {
			return "input";
		}
		return "success";
		
	}
	
	@Override
	public Register getModel() {
		// TODO Auto-generated method stub
		return registerUser;
	}
	
	
	public String getMessage() {
		return message;
	}
	
	
	public String doValidation() {
		if(registerUser.getFirstname().equals(""))
		{
			this.message="Enter first name";
			return "input";
		}
		if(registerUser.getLastname().equals("")) {
			this.message = "Enter lastname";
			return "input";
		}
		if(registerUser.getUsername().equals("")) {
			this.message = "Enter user name";
			return "input";
		}
		if(registerUser.getMiddlename().equals("")) {
			this.message="Enter middle name";
			System.out.println(this.message);
			return "input";
		}
		return null;
		
		
		
	}



	

}
