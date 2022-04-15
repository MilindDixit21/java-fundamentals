package com.ripples.abstracts;

public class AbstractDemo2 {
	public static void main(String[] args) {
		School sc = new School();
		Park pk = new Park();
		
		sc.displayName("GHS");
		sc.displayPin(111525);
		
		System.out.println("--------------------");
		
		pk.displayName("Riverfront");
		pk.displayPin(534723);

	}
}

//implemented both methods*
class School extends ParkAndCity {
	void displayName(String a) {
		System.out.println("Name: " + a);
	}
	void displayPin(int b) {
		System.out.println("PIN: " + b);
	}
}

//implemented both methods*
class Park extends ParkAndCity {
	void displayName(String a) {
		System.out.println("Name: " + a);
	}
	void displayPin(int b) {
		System.out.println("PIN: " + b);
	}
}



