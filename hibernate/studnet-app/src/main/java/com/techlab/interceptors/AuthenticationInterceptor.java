package com.techlab.interceptors;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class AuthenticationInterceptor  extends AbstractInterceptor{

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		
		HttpSession session = ServletActionContext.getRequest().getSession(false);
		
		
		System.out.println("Interceptor running");
		if(session==null ||  session.getAttribute("status") == null) {
			return "input";
		}
      
      String result = invocation.invoke();
      return result;
	}

}
