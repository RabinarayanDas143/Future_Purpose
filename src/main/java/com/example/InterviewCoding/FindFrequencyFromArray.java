package com.example.InterviewCoding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindFrequencyFromArray {
	public static void findFrequencyOfNum(int[] array) {
		// Arrays.sort(array);
		Map<Integer, Integer> map = new HashMap<>();
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
		int i, j, counter;
		for (i = 0; i < array.length; i++) {
			counter = 1;
			for (j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					counter++;
				} else {
					break;
				}
			}
			i = j - 1;
			map.put(array[i], counter);
			//System.out.println(array[i] + "-- >" + counter);
		}
		System.out.println(map);
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 1, 4, 3, 3, 5, 7, 6, 9, 10 };
		findFrequencyOfNum(array);
	}
}
