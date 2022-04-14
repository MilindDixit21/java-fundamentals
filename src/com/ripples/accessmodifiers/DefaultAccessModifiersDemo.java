package com.ripples.accessmodifiers;

public class DefaultAccessModifiersDemo {
	
	public static void main (String[] args) {
	Brother bro = new Brother();
	System.out.println(bro.money);
	System.out.println(bro.shoes);
	bro.showAll();
	}

}


class Brother{
	double money = 79798;
	String shoes ="Nike";
	
	void showAll() {
		System.out.println("Money: "+money+" | Shoes: "+shoes);
	}
	Brother(){
		
	}
}