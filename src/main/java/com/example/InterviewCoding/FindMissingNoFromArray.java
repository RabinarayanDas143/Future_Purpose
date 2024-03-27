package com.example.InterviewCoding;

public class FindMissingNoFromArray {
	public static void main(String[] args) {
		int[] array = { 1, 2, 4, 5, 6, 7, 8, 9, 10 };
		int originalSum = 0;
		int givenSum = 0;
		for (int i = 1; i <= 10; i++) {
			originalSum += i;
		}

		for (int i = 0; i < array.length; i++) {
			givenSum += array[i];
		}
		int missingNo = originalSum - givenSum;
		System.out.println("Missing number is :" + missingNo);
	}
}
