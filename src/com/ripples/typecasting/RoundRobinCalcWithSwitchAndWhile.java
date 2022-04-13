package com.ripples.typecasting;

import java.util.Scanner;

public class RoundRobinCalcWithSwitchAndWhile {

	public static void main(String[] args) {
		
		RoundRobinCalcWithSwitchAndWhile rrcalc = new RoundRobinCalcWithSwitchAndWhile();
		rrcalc.computed();

	}
	
	public static double addition(double a) {
		Scanner scan3 = new Scanner(System.in);
		System.out.print("Enter the number :: ");
		double b = scan3.nextDouble();
		return a+b;
	}
	
	public static double subtraction(double a) {
		Scanner scan3 = new Scanner(System.in);
		System.out.print("Enter the number :: ");
		double b = scan3.nextDouble();
		return a-b;
	}
	public static double multiplication(double a) {
		Scanner scan3 = new Scanner(System.in);
		System.out.print("Enter the number :: ");
		double b = scan3.nextDouble();
		return a*b;
	}
	public static double division(double a) {
		Scanner scan3 = new Scanner(System.in);
		System.out.print("Enter the number :: ");
		double b = scan3.nextDouble();		
		return a/b;
	}
	public static double modulus(double a) {
		Scanner scan3 = new Scanner(System.in);
		System.out.print("Enter the number :: ");
		double b = scan3.nextDouble();
		return a%b;
	}

	public void computed() {
		
		Scanner scan1 = new Scanner(System.in);
		System.out.print("Enter the number ::");
		double a = scan1.nextDouble();
		
		while(true) {
			
			Scanner scan2 = new Scanner(System.in);
			System.out.print("Choose operator: [+]  [-]  [*]  [/]  Clear[c]  Quit[end] ::");
			String opr = scan2.nextLine();
			double c = 0;
			
			switch(opr) {
			case "+": c= addition(a);
			System.out.println("= "+c);
				break;
			case "-": c= subtraction(a);
			System.out.println("= "+c);
				break;
			case "*": c= multiplication(a);
			System.out.println("= "+c);
				break;
			case "/": if(a == 0) {
				System.out.println("The divisor cannot be zero, Please re-enter ：: ");
				break;
				}
				c= division(a);
				System.out.println("= "+c);
				break;
			case "c": computed();
				break;
			case "C": computed();
				break;
			case "end": System.out.println("-------------------");
			System.exit(-1);
				break;
			default:
				System.out.println("Invalid operator. please choose correct operator");
			}
		}
	}
}