package com.ripples.serialization.test02;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationTest2 {

	public static void main(String[] args) {
		
		try {
			
			FileInputStream file = new FileInputStream("library-db.txt");
			
			ObjectInputStream in = new ObjectInputStream(file);
			
			Library[] labArr = (Library[]) in.readObject();
			
			for (int i = 0; i < labArr.length; i++) {
				System.out.println("Book id: "+labArr[i].getId());
				System.out.println("Book name: "+labArr[i].getName());
				System.out.println("Book price: "+labArr[i].getPrice());
				System.out.println("--------------------------------");
			}
		
			
			file.close();
			in.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getClass() + e.getMessage());
		}
		

	}

}
