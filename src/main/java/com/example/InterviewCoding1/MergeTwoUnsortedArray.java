package com.example.InterviewCoding1;

import java.util.Arrays;

public class MergeTwoUnsortedArray {

	public static int[] doingArraySort(int[] firstArray, int[] secondArray) {
		int[] mergeArray = new int[firstArray.length + secondArray.length];
		for (int i = 0; i < firstArray.length; i++) {
			for (int j = i + 1; j < firstArray.length; j++) {
				if (firstArray[i] > firstArray[j]) {
					firstArray[i] = firstArray[i] + firstArray[j];
					firstArray[j] = firstArray[i] - firstArray[j];
					firstArray[i] = firstArray[i] - firstArray[j];
				}
			}
		}
		for (int i = 0; i < secondArray.length; i++) {
			for (int j = i + 1; j < secondArray.length; j++) {
				if (secondArray[i] > secondArray[j]) {
					secondArray[i] = secondArray[i] + secondArray[j];
					secondArray[j] = secondArray[i] - secondArray[j];
					secondArray[i] = secondArray[i] - secondArray[j];
				}
			}
		}
		int i = 0, j = 0, k = 0;
		while(i<firstArray.length) {
			mergeArray[k] = firstArray[i];
			i++;
			k++;
		}
		while(j<secondArray.length) {
			mergeArray[k] = secondArray[j];
			j++;
			k++;
		}
		return mergeArray;
	}

	public static void main(String[] args) {
		int[] firstArray = { 1, 3, 5, 2, 4 };
		int[] secondArray = { 6, 9, 7, 8, 10 };

		int[] sortedArray = doingArraySort(firstArray, secondArray);
		System.out.println(Arrays.toString(sortedArray));
	}
}
