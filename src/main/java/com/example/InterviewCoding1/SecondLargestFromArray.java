package com.example.InterviewCoding1;

import java.util.Arrays;

public class SecondLargestFromArray {

	public static int getSecondLargest(int[] array) {

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
       
		return array[array.length-2];
	}

	public static void main(String[] args) {
		int[] array = { 1, 4, 7, 9, 2, 3, 6, 10 };
		int secondLargest = getSecondLargest(array);
		System.out.println(secondLargest);
	}
}
