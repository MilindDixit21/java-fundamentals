package com.ripples.multithreading;

public class RunnableThreadDemo {

	public static void main(String[] args) {
		
		Tony tony = new Tony(); //create instance of class, not thread
		Thread thread1 = new Thread(tony); //create a new thread using Thread class by taking instance of a class 
		thread1.start(); //start a thread
		
		Harry harry = new Harry();
		Thread thread2 = new Thread(harry);
		thread2.start();

	}

}

class Task{
	public void updateWork(){}
}

class Tony implements Runnable{ // class implement Runnable interface*
	@Override
	public void run() {
		System.out.println("tony is running..");
	}
}

class Harry extends Task implements Runnable{ // you can extends class as well.
	@Override
	public void run() {
		System.out.println("Harry is running...");
		
	}
}


