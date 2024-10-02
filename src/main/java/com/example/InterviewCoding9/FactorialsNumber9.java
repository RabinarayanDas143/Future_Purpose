package com.example.InterviewCoding9;

public class FactorialsNumber9 {

	public static void main(String[] args) {
		int num = 10;
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("Factorials number is :" + fact);
	}

}
