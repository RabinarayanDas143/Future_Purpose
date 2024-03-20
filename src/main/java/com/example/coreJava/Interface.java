package com.example.coreJava;

interface InterfaceImpl {
	final int i = 10;

	void print();
}
interface ln{
	static void display() {
		System.out.println("hello");
	}
}
public class Interface implements InterfaceImpl , ln{
	@Override
	public void print() {
		System.out.println("print method called");

	}

	public static void main(String[] args) {
		Interface inter = new Interface();
		inter.print();
		ln.display();
	}

}
