package com.example.InterviewCoding9;

public class FindKthLargestNumberFromArray9 {

	public static void main(String[] args) {
		int[] array = { 5, 4, 3, 2, 1, 9, 8, 7, 6, 10 };
		int Kth = 3;
		int result = getKthLargestNumber(array, Kth);
		System.out.println(result);
	}

	private static int getKthLargestNumber(int[] array, int kth) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					array[i] = array[i] + array[j];
					array[j] = array[i] - array[j];
					array[i] = array[i] - array[j];
				}
			}
			if (i == kth - 1) {
				// kth = array[i];
				// break;
				return array[i];
			}
		}
		return -1;
	}

}
