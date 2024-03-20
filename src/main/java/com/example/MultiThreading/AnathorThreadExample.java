package com.example.MultiThreading;

class AnathorTheadClass extends Thread{
	public void run() {
		for(int j=10;j>=1;j--) {
			System.out.println("My anathor thread is :"+j);
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} 
}
