package com.example.MultiThreading;

public class ThreadExample implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
			System.out.println("Thread of i is :" + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		ThreadExample obj = new ThreadExample();
		Thread thread = new Thread(obj);
		AnathorTheadClass obj1 = new AnathorTheadClass();
		//thread.start();
		//obj1.start();
		//System.out.println("Thread strat here .. ");
		System.out.println(thread.getId());
//		int sum = 10+20;
//		System.out.println("sum is :"+ sum);
//		String tname=thread.getName();
//		Thread.sleep(5000);
//		System.out.println(tname);
//		System.out.println("Thread end here ...");
		
		 
	}

}
