package com.ripples.collections.innerclass;

public class OuterTestStaticInner {
 private static double amount =8980.44;
 public static String message ="today is a good day";
 
 //Non-static inner class
 static class InnerTest {
	 private String message2 ="Hello and welcome";
	 
	 public void showData() {
		 System.out.println("Outer class data :"+amount);
		 System.out.println("Outer class message: "+message);
		 System.out.println("Inner class message: "+message2);
	}
 }
 
 public static void main(String[] args) {
	
	 //creating inner class object from 'Outer Class (OuterTestStaticInner)' reference
	 InnerTest inner = new OuterTestStaticInner.InnerTest();
	 
	 inner.showData();
}
}
