package com.example.InterviewCoding3;

import java.util.Arrays;

public class MergeTwoUnsortedArray3 {
	public static void main(String[] args) {
		int[] array1 = { 4, 3, 1, 2, 5 };
		int[] array2 = { 6, 8, 7, 9, 10 };
		int[] mergeArray = getMergeArray(array1, array2);
		System.out.println(Arrays.toString(mergeArray));
	}

	private static int[] getMergeArray(int[] array1, int[] array2) {
		int[] mergeArray = new int[array1.length + array2.length];
		int i = 0, j = 0, k = 0;
		while (i < array1.length) {
			mergeArray[k++] = array1[i++];
		}
		while (j < array2.length) {
			mergeArray[k++] = array2[j++];
		}
		boolean swapped;
		do {
			swapped = false;
			for (int l = 0; l < mergeArray.length-1; l++) {
				if (mergeArray[l] > mergeArray[l + 1]) {
					mergeArray[l] = mergeArray[l] + mergeArray[l + 1];
					mergeArray[l + 1] = mergeArray[l] - mergeArray[l + 1];
					mergeArray[l] = mergeArray[l] - mergeArray[l + 1];
					swapped = true;
				}
			}
		} while (swapped);
		return mergeArray;
	}
}
