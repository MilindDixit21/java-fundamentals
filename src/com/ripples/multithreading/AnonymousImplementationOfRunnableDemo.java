package com.ripples.multithreading;

public class AnonymousImplementationOfRunnableDemo {

	public static void main(String[] args) {
		
		Runnable obj1 = new Runnable() { // obj1 is not an object of Runnable interface
			
			@Override
			public void run() {
			System.out.println("A is running..");
				
			}
		};
		
		Runnable obj2 = new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<5;i++) {
					System.out.println("B is running..");
				}
				
			}
		};
		 
		//create a new thread with runnable target (an object) 
		Thread thread1 = new Thread(obj1); 
		thread1.start();
		
		Thread thread2 = new Thread(obj2);
		thread2.start();
 
	}

}
