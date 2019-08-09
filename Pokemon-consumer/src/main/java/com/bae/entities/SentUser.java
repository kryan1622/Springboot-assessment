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
	
	public SentUser(Long userId, String accountNumber, String userName) {
		this.userId = userId;
		this.accountNumber = accountNumber;
		this.userName = userName;
	}
	
	public SentUser() {
		super();
	}
}
