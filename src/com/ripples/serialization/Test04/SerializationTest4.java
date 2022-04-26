package com.ripples.serialization.Test04;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class SerializationTest4 {

	public static void serialized(BankAccount[] accArray) {
			
		//serialization
		try {
			FileOutputStream file = new FileOutputStream("bank-db.txt");
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(accArray);
			System.out.println("Serialiation is completed");
			file.close();
			out.close();
		} catch (IOException e) {
			System.out.println(e.getClass());
			System.out.println("file is not available!");
		}
		
	}

}
