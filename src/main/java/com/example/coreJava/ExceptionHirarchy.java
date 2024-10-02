package com.example.coreJava;

import java.io.FileNotFoundException;

class Parent {
	public void print() throws RuntimeException {
		System.out.println("Parent print method called....");
	}
}

class Child extends Parent {
	public void print() throws NullPointerException {
		System.out.println("Child print method called....");
	}
}

public class ExceptionHirarchy {

	public static void main(String[] args) {
		try {
			int result = 10 / 0;
			System.out.println("Result....");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException exception block...");
		} catch (Exception e) {
			System.out.println("Exception class block...");
		}

	}

}
