package com.example.InterviewCoding8;

public class FactorialsNumber8 {

	public static void main(String[] args) {
		int num = 10;
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial number is :" + fact);
	}

}
