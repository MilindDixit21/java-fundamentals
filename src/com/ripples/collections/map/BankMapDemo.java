package com.ripples.collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class BankMapDemo {
	public static void main(String[] args) {
		
		Account account1 = new Account(10001, "tony stark", 989995.71);
		Account account2 = new Account(10002, "Will Smith", 989996.72);
		Account account3 = new Account(10003, "Emma Watson", 989997.73);
		Account account4 = new Account(10004, "Robin Hood", 989998.74);
		Account account5 = new Account(10005, "Jack Sparrow", 989999.75);
		
		Map<Long, Account> bank = new LinkedHashMap<Long, Account>();
		

		bank.put(1000008L, account4);
		bank.put(1000007L, account3);
		bank.put(1000005L, account1);
		bank.put(1000006L, account2);

		
		
		bank.put(1000009L, account5);
		System.out.println("--------------");
		
		bank.remove(1000005L);
		System.out.println("--------------");
		
		for(Map.Entry<Long, Account> entry: bank.entrySet()) {
			System.out.println("Account Number "+entry.getKey());
			System.out.println("Account Details "+entry.getValue());
			System.out.println("--------------");
		}
	}

}
