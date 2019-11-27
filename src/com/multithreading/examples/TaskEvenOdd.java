package com.multithreading.examples;

class TaskEvenOdd implements Runnable {

	private int max;
	private OddEvenPrinter printer;
	
	public TaskEvenOdd(int max, OddEvenPrinter printer) {
		super();
		this.max = max;
		this.printer = printer;
	}

	@Override
	public void run() {
		try {
		while(printer.num <= max){
			if(printer.num %2 == 0){
				
				printer.printEven();
				
			}else
				printer.printOdd();
		}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}