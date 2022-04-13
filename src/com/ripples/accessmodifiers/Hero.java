package com.ripples.accessmodifiers;

public class Hero {

	protected String power = "healing power";

	protected void userPower() {
		System.out.println("protected => The best power is " + power);
	}

	public void showPower() {
		System.out.println("public => the pubic power: " + power);
	}
	//protected construtor*
	// classes instantiate only within the package
	protected Hero() {
		
	}

}
