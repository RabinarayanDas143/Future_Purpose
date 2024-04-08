package com.example.InterviewCoding;

import java.util.Arrays;

public class FindKthLargestNumber {

//	public static int getKthLargestNum(int[] array, int k) {
//		boolean swapped;
//
//		do {
//			swapped = false;
//			for (int i = 1; i < array.length; i++) {
//				if (array[i - 1] < array[i]) {
//					int temp = array[i - 1];
//					array[i - 1] = array[i];
//					array[i] = temp;
//					swapped=true;
//				}
//			}
//			
//		} while (swapped);
//		System.out.println(array);
//		return 0;
//	}

	public static int getKthLargestNum(int[] array, int k) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
			if(i==k-1) {
				System.out.println("k th largest number is :"+array[i]);
				break;
			}
		}
		System.out.println(Arrays.toString(array));
		return 0;
	}

	public static void main(String[] args) {
		int[] array = { 1, 6, 4, 8, 2, 3, 5, 7, 10, 9 };
		int k = 4;
		int K_th_Lagest = getKthLargestNum(array, k);
	}
}
