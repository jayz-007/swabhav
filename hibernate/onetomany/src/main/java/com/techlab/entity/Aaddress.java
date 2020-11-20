package com.techlab.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Aaddress {
	@Id
	private int id;
	private String city;
	private String country;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private Peerson person;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Peerson getPerson() {
		return person;
	}

	public void setPerson(Peerson person) {
		this.person = person;
	}
}