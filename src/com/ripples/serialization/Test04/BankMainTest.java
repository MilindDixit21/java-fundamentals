package com.ripples.serialization.Test04;

import java.util.Scanner;

public class BankMainTest {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		
		BankAccount accArray[] = new BankAccount[3];

		for (int i = 0; i < accArray.length; i++) {
			accArray[i] = new BankAccount();

			System.out.println("For account index " + i + " :-");
			System.out.println("Enter account id:");
			accArray[i].setId(Integer.parseInt(stdin.nextLine()));

			System.out.println("Enter account name:");
			accArray[i].setAccName(stdin.nextLine());

			System.out.println("Enter account balance:");
			accArray[i].setAccBal(Double.parseDouble(stdin.nextLine()));
		}
		
		BankOperationTest bot = new BankOperationTest();
		bot.deposit(accArray);
		
//		SerializationTest4 serialization = new SerializationTest4();
		SerializationTest4.serialized(accArray);

	}

}
