package com.example.coreJava;

public class AnnonymousWithThread {
	public static void main(String[] args) {
        Thread th = new Thread(new Runnable() {
        	public void run() {
        		System.out.println("run method called....");
        	}
        });
        th.start();
	}
}
