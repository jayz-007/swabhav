package com.techlab.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.Servlet;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

public class LoginService {

	private Map<String, String> userLists = new HashMap<String, String>();

	public LoginService() {
		userLists.put("admin", "admin");
		userLists.put("jay", "jay");
	}

	public boolean doAuthentication(String username, String password, SessionMap<String, Object> sessiMap) {
		HttpSession currentSession = ServletActionContext.getRequest().getSession(false);

		if (username!=null &&password!=null) {
			for (Entry<String, String> user : userLists.entrySet()) {

				if (user.getKey().equals(username) && user.getValue().equals(password)) {
					sessiMap.put("username", user.getKey());
					sessiMap.put("password", user.getValue());
					return true;
				}

			}
		}
		System.out.println(currentSession);
		return false;
	}
}

