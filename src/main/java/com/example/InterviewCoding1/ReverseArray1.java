package com.example.InterviewCoding1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseArray1 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] reverseArray = getReverseArray(array);
		// System.out.println(Arrays.toString(reverseArray));

		int[] unSort = { 5, 2, 3, 1, 4, 7, 6, 9, 8, 10 };
		int[] unSortArray = getReverseUnsortArray(unSort);
		//System.out.println(Arrays.toString(unSortArray));
		
		int[] sortArray = sortArray(unSort);
		//System.out.println(Arrays.toString(sortArray));
		
	}

	public static int[] getReverseArray(int[] array) {

		int k = 0;
		int[] reverseArray = new int[array.length];
		for (int i = array.length - 1; i >= 0; i--) {
			reverseArray[k] = array[i];
			k++;
		}
		return reverseArray;
	}

	public static int[] getReverseUnsortArray(int[] array) {
		List<Integer> list = new ArrayList<>();
		for (int i : array) {
			list.add(i);
		}
		int arraySize = list.size();
		boolean swapped;
		do {
			swapped = false;
			for (int i = 1; i < arraySize; i++) {
				if (list.get(i - 1) > list.get(i)) {
					int temp = list.get(i - 1);
					list.set(i - 1, list.get(i));
					list.set(i, temp);
					swapped = true;
				}
			}
		} while (swapped);
		int[] sortArray = new int[list.size()];
		int k = 0;
		for (int i : list) {
			sortArray[k] = i;
			k++;
		}
//		int[] reverseArray = new int[sortArray.length]; 4
//		int j = 0;
//		for (int i = sortArray.length - 1; i >= 0; i--) {
//			reverseArray[j] = sortArray[i];
//			j++;
//		}
		int[] reverseArray = getReverseArray(sortArray);
		return reverseArray;
	}

	public static int[] sortArray(int[] array) {
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
}
