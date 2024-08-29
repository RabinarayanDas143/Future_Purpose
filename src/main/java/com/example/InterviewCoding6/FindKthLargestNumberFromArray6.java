package com.example.InterviewCoding6;

public class FindKthLargestNumberFromArray6 {

	public static void main(String[] args) {
		int[] array = { 4, 1, 3, 2, 5, 8, 6, 7, 9, 10 };
		int num = 4;
		int KthLargest = findKthLargestNumber(array, num);
		System.out.println("KthLargest number is :" + KthLargest);
	}

	private static int findKthLargestNumber(int[] array, int num) {
		int kthLargest = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					array[i] = array[i] + array[j];
					array[j] = array[i] - array[j];
					array[i] = array[i] - array[j];
				}
			}
			if (i == num-1) {
				kthLargest = array[i];
				break;
			}
		}
		return kthLargest;
	}

}
