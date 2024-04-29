package com.example.InterviewCoding;

import java.util.Arrays;

public class ArrayFilter {

	public static int[] getFilterArray(int[] array) {
		int[] result = new int[array.length];
		boolean swapped;
		do {
			swapped = false;
			for (int i = 1; i < array.length; i++) {
				if (array[i - 1] < array[i]) {
					array[i - 1] = array[i - 1] + array[i];
					array[i] = array[i - 1] - array[i];
					array[i - 1] = array[i - 1] - array[i];
					swapped = true;
				}
			}
		} while (swapped);
		return array;
	}

	public static int[] moveZerosToEnd(int[] array) {
		// Create a new array to store the result
		int[] result = new int[array.length];

		// Index to insert non-zero elements
		int index = 0;

		// Loop through the original array
		for (int i = 0; i < array.length; i++) {
			// If the current element is non-zero, place it in the result array
			if (array[i] != 0) {
				result[index] = array[i];
				index++;
			}
		}

		// At this point, all non-zero elements are at the beginning
		// The remaining positions are already filled with zeros by default

		return result;
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 0, 1, 0, 5, 5, 0, 1, 3, 0 };
		// int[] result = getFilterArray(array);
		// System.out.println(Arrays.toString(result));

		int[] movezero = moveZerosToEnd(array);
		System.out.println(Arrays.toString(movezero));

		int[] a = new int[10];
		int k=0;
		for (int i = 1; i < 3; i++) {
            a[k]=i;
            k++;
		}
		//System.out.println(Arrays.toString(a));
	}
}
