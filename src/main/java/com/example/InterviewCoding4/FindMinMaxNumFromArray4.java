package com.example.InterviewCoding4;

import java.util.HashMap;
import java.util.Map;

public class FindMinMaxNumFromArray4 {
	public static void main(String[] args) {
		int[] array = { 3, 5, 7, 822, 55, 11, 77, 88, 33, 10 };
		Map<String, Integer> map = getMinMaxNum(array);
		System.out.println(map);
	}

	private static Map<String, Integer> getMinMaxNum(int[] array) {
		int min = array[0];
		int max = array[0];
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			} else if (min > array[i]) {
				min = array[i];
			}
		}
		map.put("MAX", max);
		map.put("MIN", min);
		return map;
	}
}
