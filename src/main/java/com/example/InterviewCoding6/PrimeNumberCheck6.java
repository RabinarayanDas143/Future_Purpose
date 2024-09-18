package com.example.InterviewCoding6;

public class PrimeNumberCheck6 {

	public static void main(String[] args) {
		int num = 10;
		String result = primeCheck(num);
		System.out.println(result);
	}

	private static String primeCheck(int num) {
		if (num <= 1) {
			return "Given number is not a prime number";
		}
		for (int i = 2; i < Math.sqrt(num); i++) {
			if (num % i == 0) {
				return "Given number is not a prime number";
			}
		}
		return "Given number is a prime number";
	}

}
