package com.ripples.accessmodifiers;

import com.ripples.typecasting.AmSuperHero;

public class ProtectedAccessModifiersDemo {
	public static void main(String[] args) {
		
		//SuperHero : outside package
//		AmSuperHero superhero = new AmSuperHero();

		
		//Hero : within package
		Hero hero = new Hero();
		System.out.println(hero.power);
		hero.showPower(); //protected method
		hero.userPower(); //public method
		
		
		

	}
}
