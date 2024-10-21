package com.example.InterviewCoding9;

import java.util.Arrays;

public class MergeTwoUnsortedArray9 {

	public static void main(String[] args) {
		int[] array1 = { 5, 1, 4, 2, 3 };
		int[] array2 = { 6, 9, 7, 8, 10 };

		int[] result = getMergeArray(array1, array2);
		System.out.println(Arrays.toString(result));

	}

	private static int[] getMergeArray(int[] array1, int[] array2) {
		int[] sortArray1 = getSortArray(array1);
		int[] sortArray2 = getSortArray(array2);
		int[] resultArray = new int[array1.length + array2.length];
		int k = 0;
		for (int i : sortArray1) {
			resultArray[k++] = i;
		}
		for (int i : sortArray2) {
			resultArray[k++] = i;
		}
		return resultArray;
	}

	private static int[] getSortArray(int[] array) {
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
		return array;
	}

}
