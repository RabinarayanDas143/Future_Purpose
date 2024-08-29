package com.example.InterviewCoding6;

public class FactorialNumber6 {

	public static void main(String[] args) {
		int num = 10;
		int factorial = getFactorialNumber(num);
		System.out.println(factorial);
	}

	private static int getFactorialNumber(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact *= i;
		}
		return fact;
	}

}
