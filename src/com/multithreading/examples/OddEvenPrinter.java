package com.multithreading.examples;

public class OddEvenPrinter {

	boolean isOdd;
	int num;
	
	public OddEvenPrinter(boolean isOdd, int num) {
		super();
		this.isOdd = isOdd;
		this.num = num;
	}

	public synchronized void printEven() throws InterruptedException{
		if(isOdd){
			wait();
		}
		
		System.out.println(Thread.currentThread() + "This is Even number : "  + num);
		isOdd = true;
		num++;
		notify();
	}
	
	public synchronized void printOdd() throws InterruptedException{
		if(!isOdd){
			wait();
		}
		
		System.out.println(Thread.currentThread() +  "This is odd number : "  + num);
		isOdd = false;
		num++;
		notify();
	}
}
