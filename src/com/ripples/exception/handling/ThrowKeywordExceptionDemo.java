package com.ripples.exception.handling;

import java.io.IOException;
import java.util.Scanner;

public class ThrowKeywordExceptionDemo {

	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter your age:");
			int age = Integer.parseInt(scan.nextLine());
			validateAge(age);
		} catch (RuntimeException e) {
			System.out.println(e.getClass());
			System.out.println(e.getMessage());
		}
		try {
			stringValidator(null);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	private static void validateAge(int age) {
		if(age>18) {
			System.out.println("You can vote!");
		}else {
			throw new RuntimeException("min age for vote is 18! You CAN'T vote!");
		}
	}
	
	private static void stringValidator(String str) throws IOException {
		if(str!= null && str.length()>0) {
			System.out.println("Its a valid string!");
		}
		else {
			throw new IOException("It's not a valid string!");
		}
	}

}
