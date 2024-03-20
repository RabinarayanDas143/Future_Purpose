package com.example.coreJava;
class A{
	 void method() {
		 System.out.println("parent class");
	 }
}
class B extends A{
	 void method() {
		 System.out.println("child class");
	 }
}
public class ClassCasting {
public static void main(String[] args) {
	A obj = new B();
	obj.method();
	
	B obj1 = (B) obj;
	obj1.method();
}
}
