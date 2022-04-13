package com.ripples.typecasting;

import java.util.Scanner;

public class CalculatorWhileLoop {

	public static void main(String[] args) {

		// Create objects to call methods in objects
		CalculatorWhileLoop calculator = new CalculatorWhileLoop();

		// call computer Method
		calculator.compute();
	}
	
// 1 ： There are four ways to add, subtract, multiply and divide
// （Because it's a round robin calculation, One number at a time, So the parameter list should have only one parameter ）

	// Add
	public static double add(double a) {

		System.out.print("Please enter a number ： ");
		Scanner scanner3 = new Scanner(System.in);
		double b = scanner3.nextDouble();
		return a + b;
	}

	public static double subtract(double a) {

		System.out.print("Please enter a number ： ");
		Scanner scanner3 = new Scanner(System.in);
		double b = scanner3.nextDouble();
		return a - b;
	}

	public static double multiply(double a) {

		System.out.print("Please enter a number ： ");
		Scanner scanner3 = new Scanner(System.in);
		double b = scanner3.nextDouble();
		return a * b;
	}

	public static double divide(double a) {

		System.out.print("Please enter a number ： ");
		Scanner scanner3 = new Scanner(System.in);
		double b = scanner3.nextDouble();
		return a / b;

	}

	// 2 ： Complete the function of cyclic input data （while（true）+switch）, You've to create a method to do this

	public void compute() {

		System.out.print("Please enter a number ： ");
		Scanner scanner1 = new Scanner(System.in);
		double a = scanner1.nextDouble();

		while (true) {

			Scanner scanner2 = new Scanner(System.in);
			System.out.print("Enter the operations： Add(+) Sub(-) Multiply(*) division(/) Zero clearing(c) End(end) :");
			String str = scanner2.nextLine();

			switch (str) {

			case "+":
				a = add(a);
				System.out.println("= " + a);
				break;
			case "-":
				a = subtract(a);
				System.out.println("= " + a);
				break;
			case "*":
				a = multiply(a);
				System.out.println("= " + a);
				break;
			case "/":
				if (a == 0) {
					System.out.println("The divisor cannot be zero , Please re-enter ： ");
					break;
				}
				a = divide(a);
				System.out.println("= " + a);
				break;
			case "c":
				compute();
				break;
			case "C":
				compute();
				break;
			case "end":
				System.exit(-1);
				break;
			default:
				System.out.println("Wrong character input ！");
			}

		}

	}

}
