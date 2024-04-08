package com.example.coreJava;

public class ConstructorChaining {

	public ConstructorChaining() {
		this(5);
		System.out.println("ConstructorChaining is called");
	}

	public ConstructorChaining(int i) {
		this(i, 10);
		System.out.println(i);
	}

	public ConstructorChaining(int x, int y) {
		System.out.println(x * y);
	}
	
	public static void main(String [] rabi) {
		new ConstructorChaining();
	}
}
