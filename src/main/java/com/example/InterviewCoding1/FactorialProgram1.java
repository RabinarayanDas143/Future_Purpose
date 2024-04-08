package com.example.InterviewCoding1;

public class FactorialProgram1 {
	
	public static int getFactorialNum(int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact = fact*i;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		int num = 5;
        int factNum = getFactorialNum(num);
        System.out.println(factNum);
	}
}
