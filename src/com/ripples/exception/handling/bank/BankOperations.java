package com.ripples.exception.handling.bank;

//import java.util.ArrayList;
import java.util.List;

public class BankOperations {

//	public static void main(String[] args) {
//
//		List<Account> accounts = new ArrayList<Account>();
//		accounts.add(new Account(1001, "Tony Stark", 8000.43));
//		accounts.add(new Account(1002, "Harry Potter", 9586471.25));
//		accounts.add(new Account(1003, "Eva Smith", 5684121.25));
//		accounts.add(new Account(1004, "Mark T", 5841201.12));
//
//		showBalance(1005, accounts);
//		diposit(1001, accounts, 9000);
//		withdraw(1001, accounts, 9000);
//	}

	// show balance
	public static void showBalance(int accNo, List<Account> accounts) {
		try {
			int count = 0;
			for (Account acc : accounts) {
				if (acc.accNo == accNo) {
					System.out.println(acc.accNo + " " + acc.balance + " " + acc.name);
					count++;
				}
			}
			if (count == 0) {
				throw new AccountNotFoundException("Account does not exit with accNo: " + accNo);
			}
		} catch (AccountNotFoundException e) {
			System.out.println(e);
		}
	}

	public static void withdraw(int accNo, List<Account> accounts, double amount) {
		try {
			int count = 0;
			for (Account acc1 : accounts) {
				if (acc1.accNo == accNo) {
					System.out.println("Welcome: " + acc1.name);
					count++;

					try {
						if (amount > 0 && amount < acc1.balance) {
							acc1.balance -= amount;
							System.out.println(amount+ " amount debited successfully. Your account balance is: "+ acc1.balance);

						} else {
							throw new AmountInsufficientException(
									"Amount must be lesser than account balance." + acc1.balance);
						}

					} catch (AmountInsufficientException e) {
						System.out.println(e);
					}

				}
			}
			if (count == 0) {
				throw new AccountNotFoundException("Account does not exit with accNo: " + accNo);
			}
		} catch (AccountNotFoundException e) {
			System.out.println(e);
		}

	}

	public static void diposit(int accNo, List<Account> accounts, double amount) {

		try {
			int count = 0;
			for (Account acc : accounts) {
				if (acc.accNo == accNo) {
					System.out.println("Welcome: " + acc.name);
					count++;

					try {
						if (amount > 0) {
							acc.balance += amount;
							System.out.println(
									amount + " has been credited to your account. Account balance is: " + acc.balance);
						} else {
							throw new InvalidAmountException("Amount must be greater than zero!");
						}
					} catch (InvalidAmountException e) {
						System.out.println(e);
					}

				}
			}
			if (count == 0) {
				throw new AccountNotFoundException("Account does not exit with accNo: " + accNo);
			}

		} catch (AccountNotFoundException e) {
			System.out.println(e);
		}

	}

}
