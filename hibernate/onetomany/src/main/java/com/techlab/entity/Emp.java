package com.techlab.entity;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Emp {
	@Id
	private String id;
	private String name;
	
	public void setId() {
	this.id = UUID.randomUUID().toString();
	}
	public void setName(String name) {
		this.name = name;
				
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}

}
