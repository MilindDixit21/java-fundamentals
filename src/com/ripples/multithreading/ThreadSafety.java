package com.ripples.multithreading;

class Counter {
	int count = 0;

	// adding synchronized keyword make the thread synchronized
	public synchronized void increaseCounter() { 
		count++;
	}

	public void decreaseCounter() {
		count--;
	}
}

public class ThreadSafety {

	public static void main(String[] args) throws InterruptedException {
		Counter counter = new Counter();
		
		Thread t1 = new Thread(()->{
			for(int i=0; i<1000; i++) {
				counter.increaseCounter();
			}
		});
		
		Thread t2 = new Thread(()->{
			for (int i=0; i<1000; i++) {
				counter.increaseCounter();
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println("The count: "+counter.count);

	}

}

