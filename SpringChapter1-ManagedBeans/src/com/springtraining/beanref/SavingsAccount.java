package com.springtraining.beanref;

import java.util.Date;

public class SavingsAccount {
	
	private int accountNumber;
	private String accountName;
	private Date dob;

	
	public String getDetails()
	{
		
		return this.accountNumber+" - "+this.accountName+" - "+this.dob ;
	}


	public int getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}


	public String getAccountName() {
		return accountName;
	}


	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}


	public Date getDob() {
		return dob;
	}


	public void setDob(Date dob) {
		this.dob = dob;
	}
}
