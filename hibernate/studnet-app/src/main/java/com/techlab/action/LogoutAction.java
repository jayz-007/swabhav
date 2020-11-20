package com.techlab.action;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

public class LogoutAction implements Action,SessionAware {
	private SessionMap<String, Object> sessionMap;
	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		sessionMap = (SessionMap<String, Object>) session;
		
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		this.sessionMap = (SessionMap<String, Object>) ActionContext.getContext().getSession();
		sessionMap.put("status", null);
		return "success";
	}

}
