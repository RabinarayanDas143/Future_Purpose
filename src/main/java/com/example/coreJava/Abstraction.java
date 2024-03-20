package com.example.coreJava;

abstract class ParentClass{
	abstract void method(String str);
	int k;
	public int method1(int i , int j) {
		if(i>j) {
			k=i-j;
		}else {
			k=j-i;
		}
		return k;
	}
	
	public void print() {
		 System.out.println("Parent class print method");
	}
}

public class Abstraction extends ParentClass {
	
	public static void main (String [] args) {
		Abstraction obj = new Abstraction();
		//System.out.println(obj.method1(15, 20));
		//obj.method("Hari Omm");
		ParentClass obj1 = new Abstraction();
		obj1.print();
	}

	@Override
	void method(String str) {
		// TODO Auto-generated method stub
		String result = str+" "+"Jay Shree Ram";
		System.out.println("The result is :"+result);
	}
	
	public void print() {
		 System.out.println("Abstraction class print method");
	}

}
