package com.example.InterviewCoding7;

public class FactorialNumbers7 {

	public static void main(String[] args) {
		int num = 10;
		int result = getFactorialNumber(num);
		System.out.println(result);
	}

	private static int getFactorialNumber(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;
	}

}
