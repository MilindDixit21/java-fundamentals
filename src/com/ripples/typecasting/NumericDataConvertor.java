package com.ripples.typecasting;

import java.util.Scanner;

public class NumericDataConvertor {
	public static void main(String[] args) {
//		step1. collect data from user input
//		2. convert user input into different typecast
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("::Enter an integer number value::");
		int userinput = scan.nextInt();
			
		byte smallCount = (byte)userinput;
		float flcount = userinput;
		System.out.println("-----Implicit and explict type casting-----");
		System.out.println("interger value: "+userinput);
		System.out.println("byte value: "+ smallCount);
		System.out.println("float value:  "+flcount);
	}

}
