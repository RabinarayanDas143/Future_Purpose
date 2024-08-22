package com.example.InterviewCoding5;

public class FindAmissingNumberFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 2, 3, 5, 6, 7, 8, 9, 10 };
		int missing = findMissingNumber(array);
		System.out.println("Missing number is :" + missing);
	}

	private static int findMissingNumber(int[] array) {
		int length = array.length + 1;
		int actual = 0, input = 0;
		for (int i = 0; i <= length; i++) {
			actual += i;
		}
		for (int i = 0; i < array.length; i++) {
			input += array[i];
		}
		return actual - input;
	}

}
