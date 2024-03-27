package com.example.InterviewCoding;

import java.util.Arrays;

public class MergeTwoSortedArray {
	public static int[] mergedArray(int[] arrayA, int[] arrayB) {
		int[] mergedArray = new int[arrayA.length + arrayB.length];
		int i = 0, j = 0, k = 0;

//		while (i < arrayA.length && j < arrayB.length) {
//			if (arrayA[i] < arrayB[j]) {
//				mergedArray[k] = arrayA[i];
//				i++;
//				k++;
//			} else {
//				mergedArray[k] = arrayB[j];
//				j++;
//				k++;
//			}
//		}
		
		while(i<arrayA.length) {
			mergedArray[k] = arrayA[i];
			i++;
			k++;
		}
		
		while(j<arrayB.length) {
			mergedArray[k] = arrayB[j];
			j++;
			k++;
		}

		return mergedArray;
	}

	public static void main(String[] args) {
		int[] arrayA = { 1, 2, 3, 4, 5 };
		int[] arrayB = { 6, 7, 8, 9, 10 };
		int[] mergedArray = mergedArray(arrayA, arrayB);
		System.out.println(Arrays.toString(mergedArray));
	}
}
