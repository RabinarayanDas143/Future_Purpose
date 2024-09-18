package com.example.InterviewCoding6;

public class SumofDigitsOfaNumber6 {

	public static void main(String[] args) {
		int num = 123;
		int result = getSumofDigits(num);
		System.out.println(result);
	}

	private static int getSumofDigits(int num) {
		int sum = 0;
		while (num > 0) {
			int lastDigit = num % 10;
			sum = sum + lastDigit;
			num = num / 10;
		}
		return sum;
	}

}
