package com.ripples.collections.innerclass;

public class OuterTest {
 private double amount =8980.44;
 public String message ="today is a good day";
 
 //Non-static inner class
 class InnerTest {
	 private String message2 ="Hello and welcome";
	 
	 public void showData() {
		 System.out.println("Outer class data :"+amount);
		 System.out.println("Outer class message: "+message);
		 System.out.println("Inner class message: "+message2);
	}
 }
 
 public static void main(String[] args) {
	
	 //creating outer class object
	 OuterTest outer = new OuterTest();
	 //creating inner class object from 'Outer class *object (outer)' reference
	 InnerTest inner = outer.new InnerTest();
	 
	 inner.showData();
}
}
