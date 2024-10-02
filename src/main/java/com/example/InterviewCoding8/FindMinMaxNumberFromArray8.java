package com.example.InterviewCoding8;

import java.util.HashMap;
import java.util.Map;

public class FindMinMaxNumberFromArray8 {

	public static void main(String[] args) {
		int[] array = { 5, 4, 3, 2, 1, 9, 8, 7, 6, 10 };
		Map<String, Integer> map = getMinMaxNumber(array);
		System.out.println(map);
	}

	private static Map<String, Integer> getMinMaxNumber(int[] array) {
		Map<String, Integer> map = new HashMap<>();
		int min = array[0];
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			} else if (min > array[i]) {
				min = array[i];
			}
		}
		map.put("Max", max);
		map.put("Min", min);
		return map;
	}

}
