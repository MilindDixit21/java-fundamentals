package com.ripples.multithreading;


class Bank{
	double balance;
	
	void showBalance() {
		System.out.println("balance: "+balance);
	}
	synchronized double addDeposit(double amount) {
		notify();
		balance+=amount;
		System.out.println(amount +" has been deposited in your account.");
		return balance;
		
		
	}
	synchronized double withdrawAmount(double amount) {
		try {
			wait(50000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		balance-=amount;
		System.out.println(amount+" has beed debited. Your account balance is "+balance);
		return balance;
	}
	
}

public class BankThreadSafeOperations {

	public static void main(String[] args) {
		
		Bank bank = new Bank();
		
		Thread t1 = new Thread(()->{
			bank.showBalance();
		});
		
		
		Thread t2 = new Thread(()->{
			bank.withdrawAmount(1000);
		});
		
		Thread t3 = new Thread(()->{
			bank.addDeposit(5000);
		});
		
		t1.start();
		t2.start();
		t3.start();
		
		
		// TODO: write a thread safe operation for a bank
		// showBalance, withdraw, deposit etc.

	}

}
