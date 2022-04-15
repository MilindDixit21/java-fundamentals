package com.ripples.variables;

public class InstanceVariableDemo {
	public static void main(String[] args) {
		Town town = new Town();
		town.nickName = "GBY";
		
		Town town2 = new Town();
		town2.nickName="CoolPlace";
		
		System.out.println("Town: "+town.nickName);
		System.out.println("Town2: "+town2.nickName);
	}

}

class Town {
	String park ="riverfront";  //instance variable
	int pin =06000;				//instance variable
	String nickName;			//instance variable
}
