package com.techlabs.service;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.techlabs.model.Login;

public class LoginService {

	private static LoginService instance;
	private List<Login> users;
	Login user1 = new Login("admin", "admin");
	Login user2 = new Login("rohit", "rohit");
	Login user3 = new Login("virat", "virat");
	Login user4 = new Login("sachin", "sachin");

	private LoginService() {
		users = new ArrayList<Login>();
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
	}

	public static LoginService getInstance() {
		if (instance == null) {
			instance = new LoginService();
		}
		return instance;
	}

	public List<Login> getUsers() {
		return users;
	}

	public boolean check(String username, String password) {
		for (Login user : users) {
			if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}

	public boolean isAdmin(HttpServletRequest request) {
		HttpSession session = request.getSession();
		if (session.getAttribute("username") == null) {
			return false;
		} else if (session.getAttribute("username") == "admin") {
			return true;
		}
		return false;
	}
}