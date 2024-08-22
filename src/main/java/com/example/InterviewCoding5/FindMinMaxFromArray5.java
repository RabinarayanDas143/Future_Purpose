package com.example.InterviewCoding5;

import java.util.HashMap;
import java.util.Map;

public class FindMinMaxFromArray5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 4, 1, 2, 3, 5, 8, 6, 7, 9, 10 };
		Map<String, Integer> map = getMinMaxNumber(array);
		System.out.println(map);
	}

	private static Map<String, Integer> getMinMaxNumber(int[] array) {
		Map<String, Integer> map = new HashMap<>();
		int min = array[0], max = array[0];
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
