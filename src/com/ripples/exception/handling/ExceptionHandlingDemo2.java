package com.ripples.exception.handling;

public class ExceptionHandlingDemo2 {
	static int balance = 1000;
	public static void main(String[] args) {
		transaction(10);
		transaction(0);
		transaction(20);
		
		System.out.println("----------");
		strLengthCalculator("hola");
		strLengthCalculator(null);
		strLengthCalculator("today is a good day");
		
		System.out.println("-----------");
		numberConvertor("123");
		numberConvertor("abc123");
		numberConvertor(null);

	}
	
	private static void transaction(int amount) {
		try {
			float result = balance/amount;
			System.out.println("result amount: "+result);
		} catch (ArithmeticException e) {
			System.out.println("Exception occurs: "+e.getClass());
			System.out.println("Exception message: "+e.getMessage());
		}
	}
	
	private static void strLengthCalculator(String str) {
		try {
			int length = str.length();
			System.out.println("Input String length: "+length);			
		} catch (NullPointerException e) {
			System.out.println("Exception occurs: "+e.getClass());
			System.out.println("Exception message: "+e.getMessage());
		}

	}
	
	private static void numberConvertor(String input) {
		try {
			
			int number = Integer.parseInt(input);
			System.out.println("Number: "+number);
			
		} catch (NumberFormatException e) {
			System.out.println("Exception occured and handled. "+e.getClass());
			System.out.println("Exception message: "+e.getMessage());
		}
	}
	
	

}
