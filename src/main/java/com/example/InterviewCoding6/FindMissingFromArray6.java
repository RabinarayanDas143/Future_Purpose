package com.example.InterviewCoding6;

public class FindMissingFromArray6 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 7, 8, 9, 10 };
		int missingNumber = findMissingNumber(array);
		System.out.println(missingNumber);
	}

	private static int findMissingNumber(int[] array) {
		int originalLength = array.length + 1;
		int input = 0, original = 0;
		for (int i = 0; i < array.length; i++) {
			input += array[i];
		}
		for (int i = 0; i <= originalLength; i++) {
			original += i;
		}
		return original - input;
	}

}
