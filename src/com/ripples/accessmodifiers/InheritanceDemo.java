package com.ripples.accessmodifiers;

import com.ripples.typecasting.AmSuperHero;

public class InheritanceDemo extends AmSuperHero {

	public static void main(String[] args) {
		
		InheritanceDemo inherit = new InheritanceDemo();
		System.out.println("The number: "+ inherit.number);
		System.out.println("The power: "+inherit.power);
		System.out.println("---------------");
		inherit.showNumber();
		inherit.showPower();
	}
}
