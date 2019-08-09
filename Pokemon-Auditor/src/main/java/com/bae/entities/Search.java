package com.bae.entities;

import java.util.Date;

public class Search {
	
	private long userId;
	private String accountNumber;
	private String userName;
	private String search;
	private Date date;
	
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


	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Search(long userId, String accountNumber,  String userName, String search, Date date) {
		super();
		this.userId = userId;
		this.accountNumber = accountNumber;
		this.userName = userName;
		this.search = search;
		this.date = date;
	}

	public Search() {
		super();
	}
	
	

}
