package com.techlab.interceptor;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class AuthInterceptor extends AbstractInterceptor{



	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		HttpSession currentSession = ServletActionContext.getRequest().getSession(false);
		if ( currentSession!=null&& currentSession.getAttribute("loggedIn")!=null && currentSession.getAttribute("loggedIn").equals(true) ) {
			System.out.println(currentSession.getAttribute("username")+"is username");
				return "success";
			}
		return "failure";
	}
	




}
