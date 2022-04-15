package com.ripples.variables;

public class StaticVariableDemo {
	public static void main(String[] args) {
			
		System.out.println("School > student name: "+School.Stdname);
		System.out.println("Grade > student name: "+Grade.Stdname);
	}

}

class School {
	static String Stdname = "john doe"; // static variable
	static int rollNo =8989;
}

class Grade extends School {

	static String Stdname = "mike smith";
	static int rollNo = 6767;
}