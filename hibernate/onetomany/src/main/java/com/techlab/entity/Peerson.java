package com.techlab.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Peerson {
	@Id
	private int id;
	private String name;
	@OneToOne(mappedBy = "person")
	private Aaddress address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Aaddress getAddress() {
		return address;
	}

	public void setAddress(Aaddress address) {
		this.address = address;
	}

}