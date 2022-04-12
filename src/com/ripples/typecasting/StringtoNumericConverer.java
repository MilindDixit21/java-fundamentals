package com.ripples.typecasting;

public class StringtoNumericConverer {
	public static void main(String[] args) {
//		String to Numeric converter
		
		String price ="123.34"; 	//convertible string ~ can perform string to number conversion
		String amount ="2345";  	//convertible string ~ can perform string to number conversion
		String username ="abce123"; //non-convertible string ~ gives NumberFormatException error
		
//		string (non-primitive type) to int(primitive type) => use wrapper class
		
		int intAmount = Integer.parseInt(amount);
		double doublePrice = Double.parseDouble(price);
//		byte byteUsername = Byte.parseByte(username);
		
		
		System.out.println("integer amount:" +intAmount);
		System.out.println("double price: "+ doublePrice);
//		System.out.println(byteUsername);   ~ java.lang.NumberFormatException
		
		
	}

}
