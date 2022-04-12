package com.ripples.typecasting;

public class TypeCastDemo {

	public static void main(String[] args) {
		// Implicit Type cast :Automatically
		// widening typecast
		byte count = 100;
		double counts = count;
		System.out.println(counts);

//		Explicit type conversion
//		does not happen automatically
		float fcount = 454.78f;
		byte shortcount = (byte) fcount;  
		System.out.println(shortcount);
		
	}

}