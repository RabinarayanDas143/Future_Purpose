package com.example.InterviewCoding4;

import java.util.Arrays;

public class BubbleSort4 {
	public static void main(String[] args) {
		int[] array = { 5, 1, 4, 2, 3, 9, 6, 7, 8, 10 };

		int[] sortArray1 = getSortArray1(array);
		// System.out.println(Arrays.toString(sortArray1));

		int[] sortArray2 = getSortArray2(array);
		System.out.println(Arrays.toString(sortArray2));
	}

	private static int[] getSortArray2(int[] array) {
		boolean swapped;
		do {
			swapped = false;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					array[i] = array[i] + array[i + 1];
					array[i - 1] = array[i] - array[i + 1];
					array[i] = array[i] - array[i + 1];
					swapped = true;
				}
			}
		} while (swapped);
		return array;
	}

	private static int[] getSortArray1(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					array[i] = array[i] + array[j];
					array[j] = array[i] - array[j];
					array[i] = array[i] - array[j];
				}
			}
		}
		return array;
	}
}
