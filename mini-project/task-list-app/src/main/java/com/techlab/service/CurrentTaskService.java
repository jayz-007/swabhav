package com.techlab.service;

public class CurrentTaskService {
	private static String currentTaskId;
	
	public void setCurrentTaskId(String currentTaskid) {
		this.currentTaskId = currentTaskid;
	}
	
	public String getCurrentTaskId() {
		return currentTaskId;
	}

}
