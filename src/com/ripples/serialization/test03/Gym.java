package com.ripples.serialization.test03;

import java.io.Serializable;

public class Gym implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String name;
	private float fees;
	private int batchNo;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}
	public int getBatchNo() {
		return batchNo;
	}
	public void setBatchNo(int batchNo) {
		this.batchNo = batchNo;
	}
	public Gym(String name, float fees, int batchNo) {
		super();
		this.name = name;
		this.fees = fees;
		this.batchNo = batchNo;
	}
	public Gym() {
		super();
	}
	@Override
	public String toString() {
		return "Gym [name=" + name + ", fees=" + fees + ", batchNo=" + batchNo + "]";
	}

}
