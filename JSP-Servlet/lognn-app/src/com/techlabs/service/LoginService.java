package com.techlabs.service;

import java.util.ArrayList;
import java.util.List;

import com.techlabs.model.Login;

public class LoginService {
	private LoginService loginServie ;
	private List<Login> users = new ArrayList<Login>();
	private LoginService loginService;
	
	public LoginService() {
		users.add(new Login("admin", "admin"));
		users.add(new Login("jay", "jay"));
		users.add(new Login("vinit", "vinit"));
		users.add(new Login("pawan", "pawan"));
	}
	
	public LoginService getInstance() {
		if(this.loginService==null) {
			loginService = new LoginService();
		}
		
		return loginService;
		
	}
	
	public List<Login> getUsers(){
		return users;
	}

}
