package com.example.java8Features;

class ThreadDemo implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread Demo class Run Method .");
	}

}

public class RunnableFunctionalInterface {
	public static void main(String[] args) {
		// As a noram way to call run method of Runnable interface.
		Thread thread = new Thread(new ThreadDemo());
		thread.start();
		
		// call run method of Runnable interface using lambda expression
 		Runnable runnable = ()->{
			System.out.println("Run method call using lambda expression .");
		};
		Thread lambdathread = new Thread(runnable);
		lambdathread.start();
	}
	
	 
}
