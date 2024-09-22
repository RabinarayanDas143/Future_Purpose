package com.example.InterviewCoding7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindFrequencyOfEachNumber7 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 3, 4, 5, 6, 7, 6, 7, 8, 9, 4, 5, 6, 7, 8, 10 };
		Map<Integer, Integer> result = getFrequencyOfEachNumber(array);
		System.out.println(result);
		Map<Integer, Integer> result1 = getFrequencyOfEachNumberUsingInbuilt(array);
		System.out.println(result1);
	}

	private static Map<Integer, Integer> getFrequencyOfEachNumberUsingInbuilt(int[] array) {
		List<Integer> list = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : array) {
			list.add(i);
		}
		for (int i : list) {
			map.putIfAbsent(i, Collections.frequency(list, i));
		}
		return map;
	}

	private static Map<Integer, Integer> getFrequencyOfEachNumber(int[] array) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < array.length; i++) {
			if (map.containsKey(array[i])) {
				map.put(array[i], map.get(array[i]) + 1);
			} else {
				map.put(array[i], 1);
			}
		}
		return map;
	}

}
