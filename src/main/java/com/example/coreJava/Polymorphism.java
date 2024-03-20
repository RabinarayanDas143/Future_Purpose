package com.example.coreJava;

// In java 2 type of polymorphism
// a.Compile time polymorphism (It is achieved by method overloading)
// b.Run time polymorphism (It is achieved by method overriding)
class SuperClass1 {
	int addition(int a, int b) {
		return a + b;
	}
	// Achieve Method overloading
	int addition(int a, int b, int c) {
		return a + b + c;
	}

	void print() {
		System.out.println("Achieve Method Overriding");
	}
}

public class Polymorphism extends SuperClass1 {
	// Achieve Method Overriding
	void print() {
		System.out.println("Achieve Method Overriding");
	}

	public static void main(String[] args) {
		Polymorphism obj = new Polymorphism();
		System.out.println(obj.addition(5, 10));
	}

}
