package com.example.InterviewCoding;

public class PrimeCheck {

	public static boolean primeCheck(int num) {
		if (num <= 1) {
			return false;
		}
		for(int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int num = 10;
		boolean isPrime = primeCheck(num);
		System.out.println(num +" is prime "+isPrime);
	}
}
