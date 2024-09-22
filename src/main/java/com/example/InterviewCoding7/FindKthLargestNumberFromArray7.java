package com.example.InterviewCoding7;

public class FindKthLargestNumberFromArray7 {

	public static void main(String[] args) {
		int Kth = 3;
		int[] array = { 5, 4, 3, 2, 1, 9, 8, 7, 6, 10 };
		int Kth_largest = getKthLargestNumber(array, Kth);
		System.out.println(Kth_largest);
	}

	private static int getKthLargestNumber(int[] array, int num) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					array[i] = array[i] + array[j];
					array[j] = array[i] - array[j];
					array[i] = array[i] - array[j];
				}
			}
			if (i == num -1) {
				num = array[i];
				break;
			}
		}
		return num;
	}

}
