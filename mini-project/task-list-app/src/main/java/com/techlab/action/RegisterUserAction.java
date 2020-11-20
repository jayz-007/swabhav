package com.techlab.action;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.captcha.botdetect.web.servlet.Captcha;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.service.UserService;
import com.techlab.viewmodel.AddUserVM;

public class RegisterUserAction implements Action,ModelDriven<AddUserVM> {

	private AddUserVM addUser;
	private String validationMessage;
	@Autowired
	private UserService userService;
	private String confirmPasword;
	private String captchaCode;

	@Override
	public AddUserVM getModel() {
		// TODO Auto-generated method stub
		this.addUser = new AddUserVM();
		return addUser;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public String doAdd() {
		if (doValidation()) {
			userService.addUser(addUser.getFirstname(), addUser.getLastname(), addUser.getEmail(),
					addUser.getUsername(), addUser.getPassword());
			return "success";
		}
		return "input";
	}

	public boolean doValidation() {
		System.out.println("First name is "+addUser.getEmail());
		if (addUser.getFirstname().equals("")) {
			this.validationMessage = "Please Enter First Name";
			return false;
		}
		if (addUser.getLastname().equals("")) {
			this.validationMessage = "Please Enter Last name";
			return false;
		}
		if (addUser.getEmail().equals("")) {
			this.validationMessage = "Please Enter Email";
			return false;
		}
		if (addUser.getUsername().equals("")) {
			this.validationMessage = " Please Enter Username ";
			return false;
		}
		if (addUser.getPassword().equals("")) {
			this.validationMessage = "Please Enter password";
			return false;
		}
		
		if(!addUser.getPassword().equals(confirmPasword)) {
			this.validationMessage ="Password doesn;t match";
			return false;
		}
		
		Captcha captcha = Captcha.load(ServletActionContext.getRequest(), "exampleCaptcha");
		boolean isHuman = captcha.validate(captchaCode);
		if (!isHuman) {
			this.validationMessage="Incorrect apcha code";
			return false;
		}
		return true;
	}
	
	public String getValidationMessage() {
		return validationMessage;
	}
	
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPasword = confirmPassword;
	}
	
	public String getConfirmPassword() {
		return confirmPasword;
	}
	
	public void setCaptchaCode(String captcacode) {
		this.captchaCode = captcacode;
	}
	
	public String getCaptchaCode() {
		return captchaCode;
	}


}
