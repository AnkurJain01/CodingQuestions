package com.multithreading.examples;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OddEvenPrinter printer = new OddEvenPrinter(true, 1);
		
		Thread t1 = new Thread(new TaskEvenOdd(10, printer));
		Thread t2 = new Thread(new TaskEvenOdd(10, printer));
		
		t1.start();
		t2.start();
	}

}
