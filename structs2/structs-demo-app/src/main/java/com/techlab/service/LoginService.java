package com.techlab.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LoginService {
	private Map<String,String> userLists = new HashMap<String, String>();
	
	public LoginService() {
		userLists.put("admin", "admin");
		userLists.put("jay", "jay");
	}

	
	public boolean doAuthentication(String username, String password) {
		for(Entry<String, String> user : userLists.entrySet()) {
			if(user.getKey().equals(username) && user.getValue().equals(password) ) {
				return true;
			} 
		}
		return false;
	}
}
