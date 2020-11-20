package com.techlab.action;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Map;

import org.apache.log4j.lf5.util.DateFormatManager;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.Action;
import com.techlab.service.LoginService;

public class LoginAuthentication implements Action, SessionAware {
	private String username;
	private String password;
	private String message;
	private SessionMap<String, Object> sessionMap;

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		sessionMap = (SessionMap<String, Object>) session;

	}

	@Override
	public String execute() throws Exception {
		LoginService ls = new LoginService();
		Boolean isUserValid = ls.doAuthentication(this.username, this.password, this.sessionMap);

		if (LoginDp() != null) {
			return "input";
		}
		if (isUserValid.equals(true)) {
			return "success";
		} else {
			this.message = "enter Valid username and password";
			return "input";
		}

	}

	public String getMessage() {
		return message;
	}

	public String LoginDp() {
		if (this.username != null & this.password != null) {
			if (this.username.equals("")) {
				this.message = "Please enter Username";
				return "input";
			}
			if (this.password.equals("")) {
				System.out.println("inside passn do");
				this.message = "Please Enter Password";
				return "input";
			}
		}
		return null;

	}

}