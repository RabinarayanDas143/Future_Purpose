package com.example.InterviewCoding2;

public class FactorialNumber {
	
	public static int getFactorial(int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact =fact*i;
		}
		return fact;
	}
	public static void main(String[] args) {
      int factorial = getFactorial(5);
      System.out.println(factorial);
	}
}
