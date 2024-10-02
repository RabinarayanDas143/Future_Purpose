package com.example.InterviewCoding8;

public class PrimeNumberCheck8 {

	public static void main(String[] args) {
		int num = 10;
		String result = checkPrimeNumber(num);
		System.out.println(result);
	}

	private static String checkPrimeNumber(int num) {
		if (num <= 1) {
			return "Given number is not prime number...";
		}
		for (int i = 2; i < Math.sqrt(num); i++) {
			if (num % 2 == 0) {
				return "Given number is not prime number...";
			}
		}
		return "Given number is a prime number";
	}

}
