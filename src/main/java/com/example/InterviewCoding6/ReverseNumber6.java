package com.example.InterviewCoding6;

public class ReverseNumber6 {

	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		while (num != 0) {
			int digit = num % 10;
			sum = sum * 10 + digit;
			num = num / 10;
		}
		System.out.println(sum);
	}

}
