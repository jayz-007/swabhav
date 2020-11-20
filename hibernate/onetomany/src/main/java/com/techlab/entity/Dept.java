package com.techlab.entity;

import java.util.UUID;

import javax.persistence.Id;

public class Dept {
	@Id
	private String id;
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setId() {
		this.id = UUID.randomUUID().toString();
	}

}
