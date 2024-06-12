package com.example.InterviewCoding3;

import java.util.Arrays;

public class FindMissingNumberFromArray3 {
	public static void main(String[] args) {
		int[] array = { 4, 2, 3, 1, 5, 8, 7, 9, 10 };
		int missingNum = findMissingNum(array);
		System.out.println(missingNum);
	}

	private static int findMissingNum(int[] array) {
		boolean swapped;
		do {
			swapped = false;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					array[i] = array[i] + array[i + 1];
					array[i + 1] = array[i] - array[i + 1];
					array[i] = array[i] - array[i + 1];
					swapped = true;
				}
			}
		} while (swapped);
		int length = array.length + 1;
		int actualSum = 0, givenArraySum = 0;
		for (int i = 0; i <= length; i++) {
			actualSum = actualSum + i;
		}
		for (int i = 0; i < array.length; i++) {
			givenArraySum = givenArraySum + array[i];
		}
		return actualSum - givenArraySum;
	}
}
