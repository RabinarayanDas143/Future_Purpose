package com.example.InterviewCoding7;

import java.util.Arrays;

public class MergeTwoUnsortedArray7 {

	public static void main(String[] args) {
		int[] array1 = { 5, 1, 4, 2, 3 };
		int[] array2 = { 6, 9, 7, 8, 10 };

		int[] result = getMergeArray(array1, array2);
		System.out.println(Arrays.toString(result));
	}

	private static int[] getMergeArray(int[] array1, int[] array2) {
		array1 = getSortArray(array1);
		array2 = getSortArray(array2);
		int[] result = new int[array1.length + array2.length];
		int i = 0, j = 0, k = 0;
		while (i < array1.length) {
			result[k++] = array1[i++];
		}
		while (j < array2.length) {
			result[k++] = array2[j++];
		}
		return result;
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
