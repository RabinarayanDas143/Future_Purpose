package com.example.InterviewCoding8;

public class FindOneMissingNumber8 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };
		int missing = getMissingNumber(array);
		System.out.println(missing);
	}

	private static int getMissingNumber(int[] array) {
		int originalsum = 0, inputsum = 0;
		int length = array.length + 1;
		for (int i = 0; i <= length; i++) {
			originalsum = originalsum + i;
		}
		for (int i = 0; i < array.length; i++) {
			inputsum = inputsum + array[i];
		}
		return originalsum-inputsum;
	}

}
