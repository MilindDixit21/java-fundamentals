package com.ripples.exception.handling;

import java.io.IOException;

public class ThrowsExceptionDemo {
	public static void main(String[] args) {
		
		try {
			ageValidator(19);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void ageValidator(int age) throws IOException {
		if(age >20) {
			System.out.println("its a valid age to vote");
		}else {
			throw new IOException("Not a valid age to vote");
		}
	}

}
