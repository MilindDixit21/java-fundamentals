package com.ripples.collections.innerclass.test;

public class BankAccount {
	
	private int accountNo;
	private String userName;
	private String accountType;
	private double accountBal;
	
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getAccountBal() {
		return accountBal;
	}
	public void setAccountBal(double accountBal) {
		this.accountBal = accountBal;
	}
	public BankAccount(int accountNo, String userName, String accountType, double accountBal) {
		super();
		this.accountNo = accountNo;
		this.userName = userName;
		this.accountType = accountType;
		this.accountBal = accountBal;
	}
	public BankAccount() {
		super();
	}
	@Override
	public String toString() {
		return "BankAccount [accountNo=" + accountNo + ", userName=" + userName + ", accountType=" + accountType
				+ ", accountBal=" + accountBal + "]";
	}
	
	
}
