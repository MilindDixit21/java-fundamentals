package com.ripples.typecasting;

import java.util.Scanner;

public class CalcMain {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("::Enter number 1 :");
		int numbro1 = scan.nextInt();
		System.out.println("::Enter number 2 :");
		int numbro2 = scan.nextInt();
		System.out.println("::choose operator :");
		char operator = scan.next().charAt(0);
		int result =0;
				
		Calc c1 = new Calc(numbro1, numbro2);
		
		switch(operator) {
		case '+':
			result=c1.add();
			break;
		case '-':
			result= c1.sub();
			break;
		case '*':
			result= c1.multiply();
			break;
		case '/':
			result= c1.divide();
			break;
		case '%':
			result=c1.modulus();
			break;
		default:
			System.out.println("Invalid Operator!");
			break;
		}
		System.out.println("= "+result);
		}	

}
