package com.ripples.accessmodifiers;

public class PrivateAccessModifierDemo {
	public static void main(String[] args) {
		
		Account acc = new Account();
// private property or private method are not directly accessible outside the class >> compile time error
// id, balance, username or showBalance() are not accessible directly with the help of object as well.
		
		System.out.println(acc.showId());  
		acc.showUser();
		
	}

}

class Account{
	//data members :properties
	private long id =10000434;
	private double balance =8994.89;
	private String username="mike123";
	private String password="mike@123";
	
	//private methods
	private double showBalance() {
		return balance;
	}
	
	public long showId() {
		return id;
	}
	
	public void showUser() {
		System.out.println("The user :"+ username);
	}

	public Account() {
		super();
	}
	
	
}