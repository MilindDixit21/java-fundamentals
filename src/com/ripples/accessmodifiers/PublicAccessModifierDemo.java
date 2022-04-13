package com.ripples.accessmodifiers;

import com.ripples.typecasting.GrandFather;

public class PublicAccessModifierDemo {
	public static void main(String[] args) {
		System.out.println("---------------------");
		System.out.println("within class same pckg");
		Father father = new Father();
		System.out.println(father.amount);
		System.out.println(father.park);
		System.out.println(father.showAmount());
		System.out.println(father.showPark());
		System.out.println("----------------------");
		
		System.out.println("ouside pckg -> import");
		GrandFather grandf = new GrandFather();
		System.out.println("Grandfather's park: "+grandf.park);
		System.out.println("Grandfather's surname: "+grandf.surname);
		System.out.println("Grandfather park method :"+grandf.showPark());
		System.out.println("Grandfather surname method: "+grandf.displaySurname());
	}

}
class Father{
//	data members
	public double amount =8098.808d;
	public String park ="riverfront";
	
	public double showAmount() {
		return amount;
	}
	public String showPark() {
		return park;
	}
	public Father() {
		
	}
	
}
