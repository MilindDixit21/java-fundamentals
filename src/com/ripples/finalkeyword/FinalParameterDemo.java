package com.ripples.finalkeyword;

public class FinalParameterDemo {
	public static void main(String[] args) {
		Test t = new Test();
		t.display(50);
	}

}

class Test{	
	void display(final int a) {
//		a = 30;  //-NOTE can not change the value again, once initialized with final keyword
		System.out.println("A = "+a);
	}
}
