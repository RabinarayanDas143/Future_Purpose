package com.example.coreJava;

@FunctionalInterface
interface printable {
	public void print();

	public static String method1() {
		return "Rabii";
	}
	
	default void test1() {
		System.out.println("default method of printable");
	}
}

@FunctionalInterface
interface display {
	public void print();

	public static String method1() {
		return "Aakash";
	}
	
//	default void test1() {
//		System.out.println("default method of display");
//	}
};

public class MultipleInterface implements printable, display {

	public static void main(String[] args) {
		MultipleInterface obj = new MultipleInterface();
		display.method1();
	}

	@Override
	public void print() {

	}
 
}
