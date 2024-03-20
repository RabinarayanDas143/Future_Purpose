package com.example.InterviewCoding;


public class SecondLargestArray {
	public static void main(String[] args) {
		int[] array = { 2, 8, 5, 3, 6, 4, 7,7 };

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					array[i] = array[i] + array[j];
					array[j] = array[i] - array[j];
					array[i] = array[i] - array[j];
				}
			}
		}
		int num=array[array.length-2];
		System.out.println(num);
	}
}
