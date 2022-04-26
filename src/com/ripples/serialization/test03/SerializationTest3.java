package com.ripples.serialization.test03;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SerializationTest3 {

	public static void main(String[] args) {
		
		Gym gym[] = new Gym[5];
		
		Scanner userin = new Scanner(System.in);
		
		for(int i=0; i<gym.length; i++) {
			gym[i] = new Gym();
		System.out.println("Gym membership id:"+i);
		System.out.println("Enter member name: ");
		gym[i].setName(userin.nextLine());
		
		System.out.println("Enter member batch: ");
		gym[i].setBatchNo(Integer.parseInt(userin.nextLine()));
		
		System.out.println("Enter member fees:");
		gym[i].setFees(Float.parseFloat(userin.nextLine()));
		
		}
		
//		for(int i=0; i<gym.length; i++) {
//			System.out.println("Member name: "+gym[i].getName());
//			System.out.println("Member batch: "+gym[i].getBatchNo());
//			System.out.println("Member fees: "+gym[i].getFees());
//		}
		
		try {
			FileOutputStream file = new FileOutputStream("gym-db.txt");
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(gym);
			System.out.println("serialization completed!");
			file.close();
			out.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getClass();
			e.getMessage();
		}
		
	}

}
