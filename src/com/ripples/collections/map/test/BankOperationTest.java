package com.ripples.collections.map.test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class BankOperationTest {

	public static void main(String[] args) {
		
		BankAccountTest bat1 = new BankAccountTest(988881.56, "tony", "Ezy Bank");
		BankAccountTest bat2 = new BankAccountTest(888882.56, "harry", "Lzy Bank");
		BankAccountTest bat3 = new BankAccountTest(788883.56, "ron", "Fzy Bank");
		
		LinkedHashMap<Integer, BankAccountTest> bankac = new LinkedHashMap<Integer, BankAccountTest>();
		
		bankac.put(1001, bat1);
		bankac.put(1002, bat2);
		bankac.put(1003, bat3);

//		System.out.println(bankac);
		
		for(Map.Entry<Integer, BankAccountTest> testmap: bankac.entrySet()) {
//			System.out.println("Account No: "+testmap.getKey());
//			System.out.println("Account details: "+testmap.getValue());
//			System.out.println("-----------------------------");
			
			int key = testmap.getKey();
			BankAccountTest b = testmap.getValue();
			System.out.println("key :"+ key);
			System.out.println("Balance: "+b.getBalance());
			System.out.println("-----------------------------");
		}		
		
		
		
		
		displayBalance(bankac);
		addDeposit(bankac);
		
	}
	
		
		private static void displayBalance(Map<Integer, BankAccountTest> bankac) {
//			System.out.println("Balance:"+bankac.get(1001));
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter account number");
			int acn = scan.nextInt();
			double currentAB = bankac.get(acn).getBalance();
			System.out.println("Current Account Balance: "+currentAB);
		}
		
		private static void addDeposit (Map<Integer, BankAccountTest> bankac) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter account number");
			int acn = scan.nextInt();
			double currentAB = bankac.get(acn).getBalance();
			
			
			System.out.println("Enter amount to deposit");
			double amount = scan.nextDouble();
				currentAB += amount;
				System.out.println(amount+" deposited successfully!");
				System.out.println("Current Account Balance is: "+ currentAB);
		}

}
