package com.ripples.typecasting;

public class Calc {
	
	char opname;
	int x, y;
	
	public Calc(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public int add() {
		return x+y;
	}
	public int sub() {
		return x-y;
	}
	public int multiply() {
		return x*y;
	}
	public int divide() {
		return x/y;
	}
	public int modulus() {
		return x%y;
	}

}
