package com.example.InterviewCoding9;

public class FindOneMissingNumber9 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };
		int missing = getMissingNumber(array);
		System.out.println(missing);
	}

	private static int getMissingNumber(int[] array) {
		int original = 0, input = 0;
		int length = array.length + 1;
		int result = 0;
		for (int i = 0; i <= length; i++) {
			original += i;
		}
		for (int i = 0; i < array.length; i++) {
			input += array[i];
		}
		result = original - input;
		return result;
	}

}
