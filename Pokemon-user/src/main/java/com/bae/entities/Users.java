package com.bae.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Users {

	
	@Id
	@GeneratedValue
	private Long userId;
	private String accountNumber;
	private String userName;
	
	
	public Users(Long userId, String accountNumber, String userName) {
		super();
		this.userId = userId;
		this.accountNumber = accountNumber;
		this.userName = userName;
	}


	public Users() {
		super();
	}


	public Long getUserId() {
		return userId;
	}


	public void setUserId(Long userId) {
		this.userId = userId;
	}


	public String getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
}
