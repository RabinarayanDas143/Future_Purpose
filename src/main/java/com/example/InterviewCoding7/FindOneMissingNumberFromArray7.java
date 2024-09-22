package com.example.InterviewCoding7;

public class FindOneMissingNumberFromArray7 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };
		int missing = getMissingNumber(array);
		System.out.println(missing);
	}

	private static int getMissingNumber(int[] array) {
		int originalSum = 0, inputSum = 0;
		int length = array.length + 1;
		int output =0;
		for (int i = 0; i <= length; i++) {
			originalSum = originalSum + i;
		}
		for (int i = 0; i < array.length; i++) {
			inputSum = inputSum + array[i];
		}
		output = originalSum - inputSum;
		return output;
	}

}
