package com.example.InterviewCoding2;

public class FindMissingNumberFromArray2 {

	public static int findMissing(int[] array) {
		int length = array.length + 1;

		int actualSum = 0;
		for (int i = 1; i <= length; i++) {
			actualSum += i;
		}

		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return actualSum - sum;
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };
		int missingNum = findMissing(array);
		System.out.println(missingNum);
	}
}
