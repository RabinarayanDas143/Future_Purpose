package com.example.InterviewCoding4;

public class FindMissingNumberFromArray4 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };
		int missingNumber = getMissingNumber(array);
		System.out.println(missingNumber);
	}

	private static int getMissingNumber(int[] array) {
		int length = array.length + 1;
		int actual = 0, input = 0;
		for (int i = 0; i <= length; i++) {
			actual = actual + i;
		}
		for (int i = 0; i < array.length; i++) {
			input = input + array[i];
		}
		return actual - input;
	}
}
