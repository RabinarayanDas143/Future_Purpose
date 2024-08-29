package com.example.InterviewCoding6;

import java.util.HashMap;
import java.util.Map;

public class FindMinMaxNumberFromArray6 {

	public static void main(String[] args) {
		int[] array = { 5, 2, 3, 1, 4, 7, 6, 8, 9, 10 };
		Map<String, Integer> minMax = findMinMaxFromArray(array);
		System.out.println(minMax);
	}

	private static Map<String, Integer> findMinMaxFromArray(int[] array) {
		int min = array[0];
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			} else if (min > array[i]) {
				min = array[i];
			}
		}
		Map<String, Integer> map = new HashMap<>();
		map.put("Min Number", min);
		map.put("Max Number", max);
		return map;
	}

}
