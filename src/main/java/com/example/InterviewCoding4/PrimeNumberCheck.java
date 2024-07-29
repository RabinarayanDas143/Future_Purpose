package com.example.InterviewCoding4;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		int num = 3;
		boolean result = checkPrime(num);
		System.out.println(result);
	}

	private static boolean checkPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}







