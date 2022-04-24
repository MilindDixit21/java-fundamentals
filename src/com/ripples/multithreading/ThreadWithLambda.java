package com.ripples.multithreading;

public class ThreadWithLambda {

	public static void main(String[] args) {

		Thread thread1 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Hi "+i);
			}
		});
		
		Thread thread2 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Hello "+i);
			}
		});
		
		Thread thread3 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Hola "+i);
			}
		});
		
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
