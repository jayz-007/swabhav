package com.techlab.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.Servlet;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.stereotype.Service;

import com.techlab.entity.User;
@Service
public class LoginService {

	private Map<String, String> userLists = new HashMap<String, String>();

	public LoginService() {
		/*
		 * List<User> users = new ArrayList<User>(); users = new
		 * UserService().getUsers(); System.out.println(users.size()+" is size");
		 * for(User user : users) { userLists.put(user.getUsername(),
		 * user.getPassword()); }
		 */ 
	}

	public boolean doAuthentication(String username, String password, SessionMap<String, Object> sessiMap) {

		if (username != null && password != null) {
			/*
			 * for (Entry<String, String> user : userLists.entrySet()) {
			 * 
			 * if (user.getKey().equals("jay") && user.getValue().equals("jay")) {
			 *
			 * 
			 * } }
			 */

			if (username.equals("jay") && password.equals("jay")) {
				 sessiMap.put("loggedIn", true); 
				return true;
			}
			
		}
		return false;
	}
}
