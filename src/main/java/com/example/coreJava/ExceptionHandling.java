package com.example.coreJava;

import java.io.FileNotFoundException;

class ExceptionHand {
	public void print() throws FileNotFoundException {
		System.out.println("Print method of ExceptionHand class");
	}
}

public class ExceptionHandling extends ExceptionHand {
	public void print() throws RuntimeException {
		System.out.println("Print method of ExceptionHandling class");
	}

	public static void main(String[] args) {
		ExceptionHandling obj = new ExceptionHandling();
		obj.print();
	}
}
