package com.ripples.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	
	public static void main(String[] args) {
		// 1.create object
		Employee employee = new Employee(1001, "Emma Smith", "Engineering", 459765.223f);
		Employee employee1 = new Employee(1001, "Mark Potter", "Designing", 659765.224f);
		Employee employee2 = new Employee(1001, "Tony Stark", "Marketing", 799765.225f);
		
		// 2.create a byte stream
		
		try {
			//create file output stream
			FileOutputStream file = new FileOutputStream("file-db.txt"); //this can give fileNotFoundException
			// file-db.txt contains java serializable object, which you may not be able to read.
			// need to deserialize the object to read the file.
			
			// create object stream
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			//method to serialize object
			out.writeObject(employee);
			out.writeObject(employee1);
			out.writeObject(employee2);
			System.out.println("Serialization is completed!");
			
			out.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
	}

}
