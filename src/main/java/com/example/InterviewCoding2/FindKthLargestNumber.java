package com.example.InterviewCoding2;

import java.util.Arrays;

public class FindKthLargestNumber {

	public static int getKthLargest(int[] array, int k) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					array[i] = array[i] + array[j];
					array[j] = array[i] - array[j];
					array[i] = array[i] - array[j];
				}
			}
			if (i == k) {
				k = array[i];
				break;
			}
		}
		System.out.println(Arrays.toString(array));
		return k;
	}

	public static void main(String[] args) {
		int[] array = { 1, 4, 2, 6, 3, 9, 10};
		int k = 5;
		int Kth_Largest = getKthLargest(array, k);
		System.out.println("K_th largest number is :" + Kth_Largest);
	}
}
