package com.example.InterviewCoding1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindKthLargestNumber {

	public static int getKthLargestNum(int[] array, int k) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					array[i] = array[i] + array[j];
					array[j] = array[i] - array[j];
					array[i] = array[i] - array[j];
				}
			}
			if (i == k) {
				System.out.println(Arrays.toString(array));
				k = array[i];
				break;
			}
		}
		return k;
	}

	public static void main(String[] args) {
		int[] array = { 1, 3, 7, 2, 4, 5, 6, 8, 10, 9 };
		int k = 5;
		int Kth_Largest = getKthLargestNum(array, k);
		System.out.println(Kth_Largest);
	}
}
