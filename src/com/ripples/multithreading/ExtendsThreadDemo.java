package com.ripples.multithreading;

public class ExtendsThreadDemo {

	//main thread
	public static void main(String[] args) {
		//create a new thread
		John thread1 = new John();
		thread1.start();
		
		//create a new thread
		Sam thread2 = new Sam();
		thread2.start();
		
		//create a new thread
		Patrik thread3 = new Patrik();
		thread3.start();

	}

}
class John extends Thread{
	@Override
	public void run() {
		// thread processing logic
		System.out.println("John thread is running..");
	}
	
}
class Sam extends Thread{
	@Override
	public void run() {
		// thread processing logic
		System.out.println("Sam thread is running..");
	}

}
class Patrik extends Thread{
	@Override
	public void run() {
		// thread processing logic
		System.out.println("Patrik thread is running..");
	}
}