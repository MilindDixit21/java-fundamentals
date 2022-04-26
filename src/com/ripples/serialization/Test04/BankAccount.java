package com.ripples.serialization.Test04;

import java.io.Serializable;

public class BankAccount implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int id;
	private String accName;
	private double accBal;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public double getAccBal() {
		return accBal;
	}
	public void setAccBal(double accBal) {
		this.accBal = accBal;
	}
	public BankAccount(int id, String accName, double accBal) {
		super();
		this.id = id;
		this.accName = accName;
		this.accBal = accBal;
	}
	public BankAccount() {
		super();
	}
	@Override
	public String toString() {
		return "BankAccount [id=" + id + ", accName=" + accName + ", accBal=" + accBal + "]";
	}
	

}
