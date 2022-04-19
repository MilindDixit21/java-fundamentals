package com.ripples.bank;

import java.util.Scanner;

public class BankOperations2 {

	public void operate(Account account) {
		System.out.println(" ");
		System.out.println("---------------------------------------");
		System.out.println("::Welcome to NICO Bank Application::");
		System.out.println("---------------------------------------");
		System.out.println("Hello "+account.userName+"!");
//		Scanner scan1 = new Scanner(System.in);
//		System.out.print("Enter password ::");
//		String a = scan1.nextLine();
		double c = 0;
		boolean until = true;
		
		System.out.println("Start operating your account (account no:"+account.accNo+") today!!");
		System.out.print("::> Enter amount to deposit:");
		Scanner scan4 = new Scanner(System.in);
		c = scan4.nextDouble();
		depositAmnt(account, c);
		System.out.println("---------------------------------------");
		System.out.println("Amount $"+c+" Credited Successfully!");
		System.out.println("---------------------------------------");
		

		while (true) {

			Scanner scan2 = new Scanner(System.in);
			System.out.println("\n===::What Are You Up To?::===");
			System.out.print("1. check account details  \n2. check balance  \n3. withdraw  \n4. deposit  \n5. change password  \n6. Exit \n::> To perform selected operation please enter [1 2 3 4 5 or 6]:");
			int opr = scan2.nextInt();
//			double c = 0;
			String d;
			String e;
			
			
			switch (opr) {
			case 1:
				showAccntDetails(account);
				break;
			case 2:
				showBalance(account);
				break;
			case 3: 
				System.out.print("::> Enter Amount to Withdraw:");
				Scanner scan3 = new Scanner(System.in);
				c = scan3.nextDouble();
				if(c <= 0 || c>account.accBalance) {
				System.out.println("---invalid amount, Please try again!---");
				break;
				}
				System.out.print("::> Enter Password:");
				Scanner scan5 = new Scanner(System.in);
				e = scan5.nextLine();
				if((e).equals(account.passName)) {
				withdrawAmnt(account, c);
				System.out.println("---------------------------------------");
				System.out.println(" Amount $"+c+" Debited Successfully!");
				System.out.println("---------------------------------------");
				break;
				}else 
					System.out.println("---Incorrect password! Please try again later---");
				break;
			case 4:
				System.out.print("::> Enter Amount to Deposit:");
				Scanner scan6 = new Scanner(System.in);
				c = scan6.nextDouble();
				depositAmnt(account, c);
				System.out.println("---------------------------------------");
				System.out.println(" Amount $"+c+" Credited Successfully!");
				System.out.println("---------------------------------------");
				break;
			case 5:

				Scanner scan7 = new Scanner(System.in);
				do {
					System.out.print("::> Enter New Password:");
					d = scan7.nextLine();
					if((d).equals(account.passName)) {
					System.out.println("---Sorry! You entered an old password. Try again.---");
					continue;
					}
					System.out.print("::> Re-enter New Password:");
					e = scan7.nextLine();
					if(e.equals(d)) {
						changePWD(account,d);
						System.out.println("---------------------------------------");
						System.out.println(" Password updated Successfully!");
						System.out.println("---------------------------------------");
						break;
					}else {
						System.out.println("---Passwords do not match! Try again.---");
						continue;
					}
				}while(until);
				
				break;
//			case 6:
//				operate(account);
//				break;
			case 6:
				System.out.println(" ");
				System.out.println("---------------------------------------");
				System.out.println(" *** Logged out successfully ***");
				System.out.println("---------------------------------------");
				System.exit(0);
				break;
			default:
				System.out.println("---Invalid operation. please choose correct operation---");
			}
		}

	}
	public void showAccntDetails(Account account) {
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Account Details:");
		System.out.println("Name: "+account.userName+" | Account number: "+account.accNo+" | Balace: "+account.accBalance);
		System.out.println("----------------------------------------------------------------------------");
	}

	public void showBalance(Account account) {
		System.out.println("------------------------------------------");
		System.out.println("Your account balance is: "+account.accBalance);
		System.out.println("------------------------------------------");
	}

	public double withdrawAmnt(Account account, double amount) {	
//		Scanner scan2 = new Scanner(System.in);
//		amount = scan2.nextDouble();
//		scan2.close();
		return account.accBalance -= amount;
		
	}

	public double depositAmnt(Account account, double amount) {
		return account.accBalance += amount;
	}
	
	public String changePWD(Account account, String newpass) {
		return account.passName = newpass;
	}
	
}
