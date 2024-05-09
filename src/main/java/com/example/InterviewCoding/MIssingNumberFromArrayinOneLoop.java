package com.example.InterviewCoding;

import java.util.Arrays;

public class MIssingNumberFromArrayinOneLoop {

	public static int getMissingNumber(int[] array) {
		int miising = 0;
		// its Array sort logic
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
		System.out.println(Arrays.toString(array));
		// its find missing number logic
		for(int i=0;i<array.length;i++) {
			  
			if(array[i]+1!=array[i+1]) {
				System.out.println(array[i]+1);
				break;
			}
		}
		
		return 0;
	}

	public static void main(String[] args) {
		int[] array = { 5, 3, 4, 6, 2, 8 };
		int missingNumber = getMissingNumber(array);
	}
}
