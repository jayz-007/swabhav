package com.techlab.service;

public class CurrentUserService {
	private static String currentUserId;
	
	public void setCurrentUserId(String currentUserID) {
		this.currentUserId = currentUserID;
	}
	
	public String getCurrentUSerId() {
		return currentUserId;
	}

}
