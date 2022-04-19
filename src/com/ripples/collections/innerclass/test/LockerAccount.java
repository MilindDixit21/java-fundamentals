package com.ripples.collections.innerclass.test;

public class LockerAccount {
	private int lockerNo;
	private String lockerSize;
	private int duration;
	private double rent;
	public int getLockerNo() {
		return lockerNo;
	}
	public void setLockerNo(int lockerNo) {
		this.lockerNo = lockerNo;
	}
	public String getLockerSize() {
		return lockerSize;
	}
	public void setLockerSize(String lockerSize) {
		this.lockerSize = lockerSize;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public double getRent() {
		return rent;
	}
	public void setRent(double rent) {
		this.rent = rent;
	}
	public LockerAccount(int lockerNo, String lockerSize, int duration, double rent) {
		super();
		this.lockerNo = lockerNo;
		this.lockerSize = lockerSize;
		this.duration = duration;
		this.rent = rent;
	}
	public LockerAccount() {
		super();
	}
	@Override
	public String toString() {
		return "Locker [lockerNo=" + lockerNo + ", lockerSize=" + lockerSize + ", duration=" + duration + ", rent="
				+ rent + "]";
	}
	

}
