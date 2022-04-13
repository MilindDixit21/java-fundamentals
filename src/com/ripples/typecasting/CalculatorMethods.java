package com.ripples.typecasting;

import java.util.Scanner;

class Calculator{
	int a, b; //data member : int type

//	parameterized constructor
	public Calculator(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
//	4 methods created to perfrom operations
	int add() {
		return a+b;
	}
	int sub() {
		return a-b;
	}
	int mult() {
		return a*b;
	}
	int div() {
		return a/b;
	}
	
}

public class CalculatorMethods {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number a : ");
		int a = scan.nextInt();
		System.out.print("Enter number b : ");
		int b = scan.nextInt();
		System.out.print("Choose operation (+,-,*,/): ");
		char op = scan.next().charAt(0);
		int c = 0;
		Calculator cal = new Calculator(a, b);
		
		switch(op) {
		case '+': c= cal.add(); break;
		case '-': c= cal.sub(); break;
		case '*': c= cal.mult(); break;
		case '/': c= cal.div(); break;
		default: System.out.println("Invalid Operator");
		}
		System.out.println(a+" "+op+" "+b+ " = " + c);
	}

}
