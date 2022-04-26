package com.ripples.serialization.Test04;

import java.util.Scanner;

public class BankOperationTest {
	static boolean until = true;

	public void deposit(BankAccount[] accArray) {
		Scanner sin = new Scanner(System.in);
		System.out.println("---------------------------------------");
		System.out.println("===Deposit API===");
		
		while (until) {
			int match = 0;
			System.out.println("To deposit amount please enter your account Id: ");
			int accId = sin.nextInt();
			for (int i = 0; i < accArray.length; i++) {
				if (accId == accArray[i].getId()) {
					System.out.println("Account " + accId + " is avialable!");
					System.out.println("please enter amount: ");
					double amount = sin.nextDouble();

					double ab = accArray[i].getAccBal();
					ab += amount;

					accArray[i].setAccBal(ab);
					System.out.println(amount + " has been deposited. Your account balance is " + accArray[i].getAccBal());
					match++;
					until = false;
				} 
			}
			if (match == 0) {
				System.out.println("account " + accId + " is not available!");
				
			}
		}
	}

}
