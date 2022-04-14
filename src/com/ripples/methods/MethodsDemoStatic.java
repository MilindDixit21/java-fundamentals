package com.ripples.methods;

public class MethodsDemoStatic {
	public static void main(String[] args) {
		
		MethodsDemoStatic.showMessage();
		MethodsDemoStatic.displayAuthor("Percy Jackson");
		MethodsDemoStatic.displayDetails("pj@pj.com", "Hallmark");
	}
	// non-parameterized
		public static void showMessage() {
			System.out.println("::Welcome to Java STATIC Methods::");
		}
		//one-parameterized
		public static void displayAuthor(String name) {
			System.out.println("Author's name :"+name);
		}
		//two-parameterized
		public static void displayDetails(String email, String description) {
			System.out.println("Author's email: "+email+" | Publication house: "+description);
		}

}
