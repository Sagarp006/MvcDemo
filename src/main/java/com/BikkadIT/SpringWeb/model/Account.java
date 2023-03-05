package com.BikkadIT.SpringWeb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Account {
	@Id
	private String accountno;
	private String firstname;
	private String middlename;
	private String lastname;
	private String dob;
	private String emailId;
	private String address;
	
	
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAccountno() {
		return accountno;
	}
	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	 }
	public void setLastname(String lastname) {
		this.lastname = lastname;
	 }

	public String getEmailId() {
		return emailId;
	 }
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	 }
	
	@Override
	public String toString() {
		return "UserModel [firstname=" + firstname + ", middlename=" + middlename + ", lastname=" + lastname + ", dob="
				+ dob + ", emailId=" + emailId + ", address=" + address + ", accountno=" + accountno + "]";
	  }	
}
