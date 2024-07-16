package com.example.InterviewCoding4;

public class FactorialNumber4 {
	public static void main(String[] args) {
        int num = 10;
        int factorialNumber = getFactorialNumber(num);
        System.out.println(factorialNumber);
	}

	private static int getFactorialNumber(int num) {
	    int fact = 1;
	    for(int i=1;i<=num;i++) {
	    	fact = fact*i;
	    }
		return fact;
	}
}
