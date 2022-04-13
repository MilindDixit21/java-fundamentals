package com.ripples.typecasting;

import java.util.Scanner;

public class CalculatorSwitchCase {
	public static void main(String[] args) {
		char operator;
		double num1, num2, result;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Choose an operator ( +, -, *, / ) : ");
		operator = input.next().charAt(0);
		
		System.out.print("Enter first Number: ");
		num1 = input.nextDouble();
		
		System.out.print("Enter second number: ");
		num2 = input.nextDouble();
		
		switch(operator) {
		case '+':
			result = num1 + num2;
			System.out.println(num1+" + "+num2+" = "+result);
			break;
		case '-':
			result=num1-num2;
			System.out.println(num1+" - "+num2+" = "+result);
			break;
		case '*':
			result=num1*num2;
			System.out.println(num1+" * "+num2+" = "+result);
			break;
		case '/':
			if(num2 !=0) {
			result=num1/num2;
			System.out.println(num1+" / "+num2+" = "+result);
			}
			else {
				System.out.println("::Divide by zero situation!::");
			}
			break;
		default:
			System.out.println("invalid operator!");
			break;
		}
		input.close();
		
	}

}