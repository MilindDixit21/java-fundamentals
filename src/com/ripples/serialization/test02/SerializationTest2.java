package com.ripples.serialization.test02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SerializationTest2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Library labArr[] = new Library[3];

		for (int i = 0; i < labArr.length; i++) {
			labArr[i]=new Library();
			
			System.out.println("book index:" + i);
			
			System.out.println("Enter book id:");
			labArr[i].setId(Integer.parseInt(sc.nextLine())); 
			
			System.out.println("Enter book name:");
			labArr[i].setName(sc.nextLine());
			
			System.out.println("Enter book price:");
			labArr[i].setPrice(Double.parseDouble(sc.nextLine()));
		}
		SerializationTest2 st2 = new SerializationTest2();
//		st2.printLibrary(labArr);
		
		for (int i = 0; i < labArr.length; i++) {
			System.out.println("--------------------------------");
			System.out.println("Book id: "+labArr[i].getId());
			System.out.println("Book name: "+labArr[i].getName());
			System.out.println("Book price: "+labArr[i].getPrice());
		}
		
		
		try {
			FileOutputStream file = new FileOutputStream("library-db.txt");
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(labArr);
			System.out.println("serialization is completed!");
			file.close();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

//	public void printLibrary(Library[] arr) {
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println("--------------------------------");
//			System.out.println("Book id: "+arr[i].getId());
//			System.out.println("Book name: "+arr[i].getName());
//			System.out.println("Book price: "+arr[i].getPrice());
//		}
//	}


}
