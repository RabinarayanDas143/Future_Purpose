package com.example.MultiThreading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class CustomThreadFactory implements ThreadFactory {

	@Override
	public Thread newThread(Runnable r) {
		// TODO Auto-generated method stub
		Thread thread = new Thread(r);
		thread.setPriority(Thread.NORM_PRIORITY);
		thread.setDaemon(false);
		return thread;
	}

}

class CustomRejectHandler implements RejectedExecutionHandler {

	@Override
	public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
		// TODO Auto-generated method stub
		System.out.println("Task is rejected :" + r.toString());
	}

}

public class ThreadPoolExecutorExample {
	public static void main(String[] args) {
		ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 4, 10, TimeUnit.MINUTES, new ArrayBlockingQueue<>(2),
				Executors.defaultThreadFactory(), new ThreadPoolExecutor.DiscardOldestPolicy());
		// instead of Executors.defaultThreadFactory() , you can use your own custom thread factory like CustomThreadFactory.
		// instead of new ThreadPoolExecutor.DiscardOldestPolicy() , you can use your own custom RejectExecution handler like CustomRejectHandler.
		for(int i=1;i<=4;i++) {
			executor.submit(()->{
				try {
					Thread.sleep(5000);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				System.out.println("Task Processed by :"+Thread.currentThread().getName());
			});
		}
	}
}
