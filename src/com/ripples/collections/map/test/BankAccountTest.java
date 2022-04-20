package com.ripples.collections.map.test;

public class BankAccountTest {
	private double balance;
	private String uname;
	private String bankname;
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	
	public BankAccountTest(double balance, String uname, String bankname) {
		super();
		this.balance = balance;
		this.uname = uname;
		this.bankname = bankname;
	}
	
	public BankAccountTest() {
		super();
	}
	
	@Override
	public String toString() {
		return "BankAccountTest [balance=" + balance + ", uname=" + uname + ", bankname=" + bankname + "]";
	}
}
