package com.ripples.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {

		String[] username = { "john", "mike", "tony", "will", "david", "Nick" };
		int[] userid= {1001,1002,1003,1004,1005,1006};
		long[] userbalance = {10000,20000,30000,40000,50000,60000,};
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter userid:");
		int uid = scan.nextInt();
		int match =0;

		//find a userId
		for (int index = 0; index < userid.length; index++) {
//			System.out.println("names at index "+index+" : "+userid[index]);
			
			//match user given userid with existing userid
			if (userid[index] == uid) {
				System.out.println("User is found with userid: "+uid);
				System.out.println("the Account username: "+username[index]);
				System.out.println("The Account balance: "+userbalance[index]);
				match++;
			}
		}if(match == 0) {
			System.out.println("User is not found with userid "+uid);
		}
	}

}
