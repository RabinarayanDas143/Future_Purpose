package com.example.MultiThreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

class Sum implements Callable<Integer> {
	int stop;

	public Sum(int stop) {
		super();
		this.stop = stop;
	}

	@Override
	public Integer call() throws Exception {
		int sum = 0;
		//IntStream sum = IntStream.rangeClosed(0, stop);
		for (int i = 0; i <= stop; i++) {
			sum = sum + i;
		}
		return sum;
	}

}



public class CallableExample {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService ex = Executors.newFixedThreadPool(3);
        Future<Integer> sum = ex.submit(new Sum(10));
        //System.out.println(sum.get());
        
        Runnable run=()->{
        	System.out.println("Run method start");
        	try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	System.out.println("Run method Completed");
        };
        
        Future<?> future = ex.submit(run);
        future.get();
        System.out.println("Execution complete successfully");
	}
}
