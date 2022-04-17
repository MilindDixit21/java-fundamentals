package com.ripples.arrays;

import java.util.Arrays;

public class MultidimentionArray {
	public static void main(String[] args) {
		
		int num[][] = {{2,4,6},{1,3,5},{7,8,9}};
		
		for (int row=0; row<num.length; row++) {
			System.out.println("--------------------");
			for(int col=0; col<num[row].length; col++) {
				System.out.println("Row: "+row+" Col: "+col+" "+ num[row][col]);
			}
		}
	}

}
