package com.techlab.action;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;

import com.captcha.botdetect.web.servlet.Captcha;
import com.opensymphony.xwork2.ActionSupport;
import com.techlab.service.EmailService;

public class EmailAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	private String name;
	private String gender;
	private String to;
	private String address;
	private int age;
	private EmailService obj = null;
	int resp = 0;
	private String captchaCode;

	public String getCaptchaCode() {
		return captchaCode;
	}

	public void setCaptchaCode(String captcha) {
		this.captchaCode = captcha;
	}

	public String getName() {
		return name;
	}

	public void setName(String firstName) {
		this.name = firstName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setBody(int age) {
		this.age = age;
	}

	public EmailService getObj() {
		return obj;
	}

	public void setObj(EmailService obj) {
		this.obj = obj;
	}

	@Override
	public String execute() {
		obj = new EmailService();
		resp = obj.sendMail(to);
		if (resp == 1) {
			return "success";
		} else
			return "error";

	}

	public void validate() {
		Captcha captcha = Captcha.load(ServletActionContext.getRequest(), "exampleCaptcha");
		boolean isHuman = captcha.validate(captchaCode);
		if (!isHuman) {
			addFieldError("captchaCode", "Incorrect code");
		}
		System.out.println(captcha.getCaptchaId());
		// reset captcha code textbox
		captchaCode = null;
	}

}