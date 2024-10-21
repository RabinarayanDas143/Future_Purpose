package com.example.InterviewCoding9;

public class PrimeNumberCheck9 {

	public static void main(String[] args) {
		 int num = 7;
		 String result = primeCheck(num);
		 System.out.println(result);
	}

	private static String primeCheck(int num) {
		if(num<=1) {
			return "Given number is not a prime number";
		}
		for(int i=2;i<Math.sqrt(num);i++) {
			if(num%2==0) {
				return "Given number is not a prime number";
			}
		}
		return "Given number is a prime number";
	}

}
