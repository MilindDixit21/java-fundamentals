package com.ripples.multithreading;

public class AnonymousImplementationOfRunnableDemo2 {

	public static void main(String[] args) {
				 
		 
		Thread thread1 = new Thread(new Runnable() { 
			
			@Override
			public void run() {
			System.out.println("A is running..");
				
			}
		}); 
		thread1.start();
		
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<5;i++) {
					System.out.println("B is running..");
				}
				
			}
		});
		thread2.start();
 
	}

}
