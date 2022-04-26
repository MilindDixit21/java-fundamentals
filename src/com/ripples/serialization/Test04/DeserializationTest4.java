package com.ripples.serialization.Test04;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationTest4 {

	public static void main(String[] args) {
		
		try {
			
			FileInputStream file = new FileInputStream("bank-db.txt");
			ObjectInputStream in = new ObjectInputStream(file);
			BankAccount bankArry[]= (BankAccount[]) in.readObject();
			
			for(int i=0; i<bankArry.length; i++) {
				System.out.println("Account Id: "+bankArry[i].getId()+" | user name: "+bankArry[i].getAccName()+" | balance: "+bankArry[i].getAccBal());
			}
			
			file.close();
			in.close();
			
		} catch (Exception e) {
			System.out.println(e.getClass());
			System.out.println(e.getMessage());
		}

	}

}
