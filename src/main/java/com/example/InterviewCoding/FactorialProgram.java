package com.example.InterviewCoding;

public class FactorialProgram {
	  static int getFactorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
       int fact = getFactorial(5);
       System.out.println(fact);
	}
}
