package com.example.InterviewCoding5;

public class PrimeNumberCheck5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		boolean check = checkPrime(num);
		System.out.println("Given number is prime :" + check);
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
