package com.example.InterviewCoding;

import java.util.Arrays;

public class MergeTwoUnsortedArray {

	public static int[] mergedArray(int[] arrayA, int[] arrayB) {
		int[] mergedArray = new int[arrayA.length + arrayB.length];
		int i = 0, j = 0, k = 0;
		// Sort first array
		for (int fi = 0; fi < arrayA.length; fi++) {
			for (int fj = fi + 1; fj < arrayA.length; fj++) {
				if (arrayA[fi] > arrayA[fj]) {
					arrayA[fi] = arrayA[fi] + arrayA[fj];
					arrayA[fj] = arrayA[fi] - arrayA[fj];
					arrayA[fi] = arrayA[fi] - arrayA[fj];
				}
			}
		}

		// Sort second array
		for (int fi = 0; fi < arrayB.length; fi++) {
			for (int fj = fi + 1; fj < arrayB.length; fj++) {
				if (arrayB[fi] > arrayB[fj]) {
					arrayB[fi] = arrayB[fi] + arrayB[fj];
					arrayB[fj] = arrayB[fi] - arrayB[fj];
					arrayB[fi] = arrayB[fi] - arrayB[fj];
				}
			}
		}

		while (i < arrayA.length) {
			mergedArray[k] = arrayA[i];
			i++;
			k++;
		}

		while (j < arrayB.length) {
			mergedArray[k] = arrayB[j];
			j++;
			k++;
		}

		return mergedArray;
	}

	public static void main(String[] args) {
		int[] arrayA = { 1, 3, 5, 2, 4 };
		int[] arrayB = { 6, 7, 9, 10, 8 };
		int[] mergedArray = mergedArray(arrayA, arrayB);
		System.out.println(Arrays.toString(mergedArray));
	}
}
