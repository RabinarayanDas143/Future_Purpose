package com.example.MultiThreading;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Task implements Runnable {
	private int taskId;

	public Task(int taskId) {
		this.taskId = taskId;
	}

//	Runnable run = () -> {
//		System.out.println("Task " + taskId + " is running on thread " + Thread.currentThread().getName());
//	};

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Task " + taskId + " is running on thread " + Thread.currentThread().getName());
	}
}

public class ExecutorsExample {
	public static void main(String[] args) {
		// in this way we are every time creating new thread for assigning a task .
//		for (int i = 1; i <= 10; i++) {
//             Thread thread = new Thread(new Task(i));
//             thread.start();
//		}

		// in this way we are using ThreadPoolExecutor concept , in this case we are
		// creating 3 thread and assigning all the task
		// 3 thread execute all the task one by one , it reuse the thread .
		// newFixedThreadPool internally use the ThreadPoolExecutor concept .

//		ExecutorService ex = Executors.newFixedThreadPool(3);
//		for (int i = 1; i <= 10; i++) {
//			ex.execute(new Task(i));
//		}
//		ex.shutdown();

		// when we are don't know how many thread we have to create then we use  newCachedThreadPool method .
		// it automatically create the thread according to the task and destroy it with in 60 sec. if any task 
		// is not assign to the thread .
		// but in this case if there are vast no of task is come then there is lots of thred is created and 
		// it impact to our memory .
		
//		ExecutorService ex = Executors.newCachedThreadPool();
//		for (int i = 0; i <= 10; i++) {
//			ex.execute(new Task(i));
//		}
//		ex.shutdown();
		
		ScheduledExecutorService ex = Executors.newScheduledThreadPool(3);
		ex.scheduleAtFixedRate(new Task(1), 4, 1, TimeUnit.SECONDS);
	}
}
