package com.example.InterviewCoding3;

public class FactorialNumber {
	public static void main(String[] args) {
       int num =5;
       int factorial = getFactorialNumber(num);
       System.out.println(factorial);
	}

	private static int getFactorialNumber(int num) {
		 int factorial=1;
		 for(int i=1;i<=num;i++) {
			 factorial=factorial*i;
		 }
		return factorial;
	}
}
