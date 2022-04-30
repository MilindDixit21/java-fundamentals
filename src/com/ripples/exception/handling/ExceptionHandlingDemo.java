package com.ripples.exception.handling;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		System.out.println("Program Initiated!");
		try {
		int balance = 2000;
		int amount = 0;
		int result = balance/amount;
		System.out.println("Result: "+result);
		
		}catch(Exception e){
			System.out.println("Exception occured and handled. "+e.getClass());
			System.out.println(e.getMessage());
		} /*finally {
			System.out.println("Always execute!!"); //finally block is always execute
		}*/
		System.out.println("Program Terminated!"); 
	}

}
