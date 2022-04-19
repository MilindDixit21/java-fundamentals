package com.ripples.bank;

import java.util.Scanner;

public class BankMain {
	public static void main(String[] args) {
		
		
		Scanner scann = new Scanner(System.in);
		
		System.out.println("===::Open New Bank Account::===");
		System.out.println(" ");
		System.out.print("Enter customer name:");
		String userName = scann.nextLine();
		System.out.print("Enter password:");
		String passName = scann.nextLine();
		System.out.print("Choose account number:");
		long accNo = scann.nextLong();
//		System.out.println("Enter account balance:");
//		double accBalance = scann.nextDouble();
		double accBalance = 0;
		
		Account account = new Account(accNo, accBalance, userName, passName);
		
		BankOperations bankop = new BankOperations();
		bankop.operate(account);
		
	}
	
}
