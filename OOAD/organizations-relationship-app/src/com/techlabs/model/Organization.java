package com.techlabs.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

public class Organization {
	private UUID id;
	private String name;
	private Date registrationDate;
	private List<Partner> partners = new ArrayList<Partner>();
	private List<Talent> talents = new ArrayList<Talent>();

	public Organization(String id, String name, String registrationDate) throws ParseException {
		this.id = UUID.fromString(id);
		this.name = name;
		SimpleDateFormat date = new SimpleDateFormat("MM/dd/yyyy");
		this.registrationDate = date.parse(registrationDate);

	}

	public void addPartner(Partner p) {
		partners.add(p);
	}

	public void addTalent(Talent t,Partner p) {
		talents.add(t);
		if(p!=null)
			p.addTalent(t);
	}

	public int partnerCount() {
		return partners.size();
	}

	public UUID getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public Iterator<Partner> getPArtners() {
		return partners.iterator();

	}

	public Iterator<Talent> getTalents() {
		return talents.iterator();
	}

}
