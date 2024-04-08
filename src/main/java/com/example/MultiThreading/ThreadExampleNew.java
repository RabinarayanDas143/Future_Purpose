package com.example.MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Suming {
	int stop;

	public Suming(int stop) {
		this.stop = stop;
	}

	int sum = 0;

	Runnable run = () -> {
		for (int i = 0; i <= stop; i++) {
			sum += i;
		}
		System.out.println(sum);
	};

//	@Override
//	public void run() {
//
//		for (int i = 0; i <= stop; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
//	}

}

public class ThreadExampleNew {

	public static void main(String[] args) {
		// Suming sum = new Suming(10);
//       Thread th = new Thread(sum);
//       th.start();
		Runnable run = () -> {
			int sum1 = 0;
			for (int i = 0; i <= 10; i++) {
				sum1 += i;
			}
			System.out.println(sum1);
		};
		ExecutorService ex = Executors.newSingleThreadExecutor();
		ex.submit(run);
		// ex.submit();
	}
}
