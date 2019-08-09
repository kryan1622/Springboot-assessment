package com.bae.entities;

public class SentUser {
	
	private Long userId;
	private String accountNumber;
	private String userName;
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
	public SentUser(Users user) {
		this.userId = user.getUserId();
		this.accountNumber = user.getAccountNumber();
		this.userName = user.getUserName();
	}
	public SentUser() {
		super();
	}
	
	
   
}
