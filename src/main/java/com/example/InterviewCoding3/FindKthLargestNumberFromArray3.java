package com.example.InterviewCoding3;

public class FindKthLargestNumberFromArray3 {
	public static void main(String[] args) {
		int[] array = { 4, 2, 1, 3, 5, 9, 6, 7, 8, 10 };
		int Kth = 2;
		int Kth_Largest = findKthLargestNumber(array, Kth);
		System.out.println(Kth_Largest);
	}

	private static int findKthLargestNumber(int[] array, int kth) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if (array[i] < array[j]) {
					array[i] = array[i] + array[j];
					array[j] = array[i] - array[j];
					array[i] = array[i] - array[j];
				}
			}
			if(i==kth-1) {
				kth=array[i];
				break;
			}
		}
		return kth;
	}
}
