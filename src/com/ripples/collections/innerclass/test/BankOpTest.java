package com.ripples.collections.innerclass.test;

import com.ripples.collections.innerclass.test.BankOpTest.Banking;
import com.ripples.collections.innerclass.test.BankOpTest.Lockers;

public class BankOpTest { //outerclass

	class Banking { //innerclass

		public void showAccDetails(BankAccount ba) {
			System.out.println("Account Details: " + ba.getUserName() + " | " + ba.getAccountNo() + " | "
					+ ba.getAccountType() + " | " + ba.getAccountBal());
		}

		public void withdrawAmnt(BankAccount ba, double amount) {
			double x = ba.getAccountBal();
//			return x-= amount;
			ba.setAccountBal(x -= amount);
		}

		public void depAmnt(BankAccount ba, double amount) {
			double x = ba.getAccountBal();
			ba.setAccountBal(x);
		}

	}

	class Lockers {

		public void showLockerDetails(BankAccount ba, LockerAccount la) {
			System.out.println("User Name:" + ba.getUserName() + "\nlocker No: " + la.getLockerNo() + "\nlocker size: "
					+ la.getLockerSize());
		}

		public void showLockerRent(LockerAccount la) {
			System.out.println("Locker rent: " + la.getRent());
		}

	}

	public static void main(String[] args) {
		BankAccount nba = new BankAccount(101, "Harry", "Savings", 50000.26);
		
		//to access inner class, first create outer class object
		BankOpTest bop = new BankOpTest();
		//creating inner class object from 'Outer class *object (bop)' reference
		Banking banking = bop.new Banking();

		banking.showAccDetails(nba);
		banking.withdrawAmnt(nba, 1000);
		banking.showAccDetails(nba);

		LockerAccount nla = new LockerAccount(452, "10x12", 12, 800.52);

		Lockers locker = bop.new Lockers();
		locker.showLockerDetails(nba, nla);
		locker.showLockerRent(nla);
	}

}
