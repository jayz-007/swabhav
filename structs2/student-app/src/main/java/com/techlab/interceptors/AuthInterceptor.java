package com.techlab.interceptors;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.techlab.service.LoginService;

public class AuthInterceptor extends AbstractInterceptor{



	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		HttpSession currentSession = ServletActionContext.getRequest().getSession(false);
		if ( currentSession!=null&& currentSession.getAttribute("password")!=null && currentSession.getAttribute("username")!=null) {
			System.out.println(currentSession.getAttribute("username"));
			if (currentSession.getAttribute("username").equals("admin")
					&& currentSession.getAttribute("password").equals("admin")) {
				return "success";
			}
		}
		return "failure";
	}
	




}
