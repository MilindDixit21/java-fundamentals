package com.ripples.abstracts;

// abstract class
abstract class Father {
	
	//abstract method (it makes the class abstract class)
	abstract void displayName(String name);
	abstract void displayContact(String phone);
}

// one unimplemented method makes this class abstract*
// class object* CAN NOT be created now with this class
abstract class Son extends Father {
	void displayName(String a) {
		System.out.println("Name: " + a);
	}
}

//inherited another class to implement the unimplemented method.
// class object CAN be created now with this class
class GrandSon extends Son {
	void displayContact(String b) {
		System.out.println("Contact: " + b);
	}
}

//public class w/ main method*
public class AbstractDemo { 
	public static void main(String[] args) {
		GrandSon gs = new GrandSon();
		gs.displayName("Harry");
		gs.displayContact("1234567");
	}
}

