package com.example.InterviewCoding5;

public class FactorialNumber5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		int fact = getFatorial(num);
		System.out.println(fact);
	}

	private static int getFatorial(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact *= i;
		}
		return fact;
	}

}
