package com.ripples.methods;

public class MethodsDemoNonStatic {
	public static void main(String[] args) {
		MethodsDemoNonStatic demo = new MethodsDemoNonStatic();
		demo.showMessage();
		demo.displayAuthor("J.Rolling");
		demo.displayDetails("jkr@email.com", "JK Publication House");
		}
	// non-parameterized
	public void showMessage() {
		System.out.println("::Welcome to Java NON-STATIC Methods::");
	}
	//one-parameterized
	public void displayAuthor(String name) {
		System.out.println("Author's name :"+name);
	}
	//two-parameterized
	public void displayDetails(String email, String description) {
		System.out.println("Author's email: "+email+" | Publication house: "+description);
	}
}
