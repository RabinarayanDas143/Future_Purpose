package com.example.InterviewCoding3;

public class FindMaxAndMinNoFromArray3 {
	public static void main(String[] args) {
		int[] array = { 3, 2, 5, 7, 4, 9 };
		getMinAndMaxNo(array);
	}

	private static void getMinAndMaxNo(int[] array) {

		int Max = array[0];
		int Min = array[0];

		for (int i = 0; i < array.length; i++) {
			if (Max < array[i]) {
				Max = array[i];
			} else if (Min > array[i]) {
				Min = array[i];
			}
		}
		System.out.println("Max no from array is :"+Max+" and Min no is :"+Min);

	}
}
