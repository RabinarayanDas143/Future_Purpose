package com.example.InterviewCoding5;

public class SumOfDigitsOfaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5678910;
		int sum = 0;
		while (num > 0) {
			int digit = num % 10;
			sum += digit;
			num = num / 10;
		}
		System.out.println("Sum of digit is :" + sum);
	}

}
