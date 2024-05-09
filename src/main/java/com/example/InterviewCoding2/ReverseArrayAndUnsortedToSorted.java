package com.example.InterviewCoding2;

import java.util.Arrays;

public class ReverseArrayAndUnsortedToSorted {

	public static int[] getSortArray(int[] array) {
		boolean swapped;
		do {
			swapped = false;
			for (int i = 1; i < array.length; i++) {
				if (array[i - 1] > array[i]) {
					array[i - 1] = array[i - 1] + array[i];
					array[i] = array[i - 1] - array[i];
					array[i - 1] = array[i - 1] - array[i];
					swapped = true;
				}
			}
		} while (swapped);
		return array;
	}

	public static int[] getRevArray(int[] array) {
		int[] sortArray = getSortArray(array);
		int[] revArray = new int[array.length];
		int k=0;
		for(int i=sortArray.length-1;i>=0;i--) {
			revArray[k]=sortArray[i];
			k++;
		}
		return revArray;
	}

	public static void main(String[] args) {
		int[] array = { 10, 8, 5, 9, 7, 6, 2, 4, 3, 1 };
		int[] revArray = getRevArray(array);
		System.out.println(Arrays.toString(revArray));
	}
}
