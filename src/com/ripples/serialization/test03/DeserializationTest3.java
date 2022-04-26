package com.ripples.serialization.test03;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationTest3 {

	public static void main(String[] args) {
		
		try {
			
			FileInputStream file = new FileInputStream("gym-db.txt");
			ObjectInputStream in = new ObjectInputStream(file);
			Gym gym[] =	(Gym[]) in.readObject();
			
			
			for(int i=0; i<gym.length; i++) {
			System.out.println("gym member Name: "+gym[i].getName());
			System.out.println("BatchNo: "+gym[i].getBatchNo());
			System.out.println("Fees: "+gym[i].getFees());
			System.out.println("----------------");
			}
			file.close();
			in.close();
		} catch (Exception e) {
			System.out.println(e.getClass());
			System.out.println(e.getMessage());
		}


	}

}
