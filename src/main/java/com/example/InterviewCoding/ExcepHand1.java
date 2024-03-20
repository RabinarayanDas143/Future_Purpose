package com.example.InterviewCoding;

class superclass {
	String print() throws RuntimeException {
		String str = "Rabinarayan Das";
		System.out.println("super class callled");
		return str;
	}
}


public class ExcepHand1 extends superclass {
	String print() throws IllegalArgumentException {
		String str = "hii Rabi";
		System.out.println("chaild classs called");
		return str;
	}
	
	

	public static void main(String[] args) {
		//ExcepHand1 obj =new ExcepHand1();
		//obj.print();
		
//		superclass obj = new ExcepHand1();
//		 obj.print();
		superclass obj =  new ExcepHand1();
		obj.print();
		
	}
}
