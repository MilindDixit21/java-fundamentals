package com.ripples.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationDemo {
	public static void main(String[] args) {

		try {
			// 1. read from file input stream
			FileInputStream file = new FileInputStream("file-db.txt");

			// 2.create object input stream
			ObjectInputStream in = new ObjectInputStream(file);

			// 3. method to de-serialization
			Employee emp = (Employee) in.readObject();
			Employee emp2 = (Employee) in.readObject();
			Employee emp3 = (Employee) in.readObject();

			System.out.println("De-serialization is completed!");
			System.out.println("-----------------------");

			System.out.println("Employee Name: " + emp.getName());
			System.out.println("Employee Id: " + emp.getId());
			System.out.println("Employee Dept: " + emp.getDept());
			System.out.println("Employee Salary: " + emp.getSalary());
			System.out.println("-----------------------");

			System.out.println("Employee 2 Name:" + emp2.getName());
			System.out.println("Employee 3 Name:" + emp3.getName());

			in.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
