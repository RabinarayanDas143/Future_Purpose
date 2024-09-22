package com.example.InterviewCoding7;

public class SumOfDigitOfaNumber7 {

	public static void main(String[] args) {
		int str = 123;
		int sum = 0;
		while (str > 0) {
			int digit = str % 10;
			sum = sum + digit;
			str = str / 10;
		}
		System.out.println(sum);
	}

}
