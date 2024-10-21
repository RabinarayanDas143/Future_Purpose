package com.example.InterviewCoding8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindFrequencyOfEachNumber8 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 3, 4, 5, 6, 7, 6, 7, 8, 9, 4, 5, 6, 7, 8, 10 };
		Map<Integer, Integer> map1 = getFreqWithoutInbuilt(array);
		System.out.println(map1);
		Map<Integer, Integer> map2 = getFreqUseInbuiltMethod(array);
		System.out.println(map2);
	}

	private static Map<Integer, Integer> getFreqUseInbuiltMethod(int[] array) {
		Map<Integer, Integer> map = new HashMap<>();
		List<Integer> list = new ArrayList<>();
		for (int i : array) {
			list.add(i);
		}
		for (int i : list) {
			map.put(i, Collections.frequency(list, i));
		}
		return map;
	}

	private static Map<Integer, Integer> getFreqWithoutInbuilt(int[] array) {
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