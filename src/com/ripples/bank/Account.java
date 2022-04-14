package com.ripples.bank;

public class Account {
	
	public long accNo;
	public double accBalance;
	public String userName;
	public String passName;
	
	public Account() {
		super();
	}

	public Account(long accNo, double accBalance, String userName, String passName) {
		super();
		this.accNo = accNo;
		this.accBalance = accBalance;
		this.userName = userName;
		this.passName = passName;
	}
	
}
