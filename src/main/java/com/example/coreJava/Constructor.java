package com.example.coreJava;

class Example{
	Example(){
		super();
		System.out.println("Example class constructor .");
	}
}

public class Constructor extends Example{
	 
	public Constructor() {
		// TODO Auto-generated constructor stub
		super();
		System.out.println("constructor is called.");
	}
	  
	public Constructor(String msg) {
		super();
		System.out.println("In parametersied constructor of constructor class");
	}
	
	public static void main(String[] args) {
		Constructor cons = new Constructor("Rabi");
		Constructor cons1 = new Constructor();
		Example exam = new Constructor();
		 
	}
 }
