package com.techlabs.model;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

public abstract class Account {
	private int accno;
	private String name;
	protected double balance;
	private Date creationDate;
	private Date dateOfBirth;
	private int age;
	protected String accounttype;
	

	public Account(int accno, String name, double balance ,String creationDate,String dateOfBirth) throws ParseException {
		this.accno = accno;
		this.name = name;
		this.balance = balance;
		  SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
			this.creationDate= formatter.parse(creationDate);
			this.dateOfBirth = formatter.parse(dateOfBirth);
			this.age = calculateAge();
		

	}
	
	private int calculateAge() {
		  SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		  Calendar c = Calendar.getInstance();
		  c.setTime(this.dateOfBirth);
		  int year = c.get(Calendar.YEAR);
		  int month = c.get(Calendar.MONTH) + 1;
		  int date = c.get(Calendar.DATE);
		  LocalDate dateOfbirth = LocalDate.of(year, month, date);
		  LocalDate PresentDate = LocalDate.now();
		  Period age = Period.between(dateOfbirth, PresentDate);
		  return age.getYears();
		 
		
	 }
	public void deposit(double amt) {
		balance = balance + amt;
	}

	public abstract void withdraw(double amt);

	public int getAccno() {
		return accno;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}
	
	public Date getCurrentDate() {
		return creationDate;
	}
	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getAccountType() {
		return accounttype;
	}

}
