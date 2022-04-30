package com.ripples.exception.handling.bank;

import java.util.ArrayList;
import java.util.List;

public class BankExceptionMainDemo {

	public static void main(String[] args) {
		
		List<Account> accnt = new ArrayList<Account>();
		accnt.add(new Account(1001, "David Doe", 652000.23));
		accnt.add(new Account(1002, "Eva Smith", 82651.21));
		accnt.add(new Account(1003, "Mike Parker", 69800.25));
		
		
		BankOperations.showBalance(1002, accnt);
		System.out.println("-------------");
		BankOperations.diposit(1003, accnt, 5000);
		System.out.println("-------------");
		BankOperations.withdraw(1003, accnt, 3000);
	}

}
