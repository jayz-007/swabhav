package com.techlab.action;

import com.opensymphony.xwork2.ActionSupport;
import com.techlab.service.EmailService;

public class EmailAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String from;
	private String password;
	private String to;
	private String subject;
	private String body;
	private EmailService obj = null;
	int resp = 0;

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
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
		resp = obj.sendMail(from, password, to, subject, body);
		if (resp == 1) {
			return "success";
		} else {
			return "error";
		}
	}
}