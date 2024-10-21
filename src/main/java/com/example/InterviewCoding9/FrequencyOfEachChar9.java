package com.example.InterviewCoding9;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfEachChar9 {

	public static void main(String[] args) {
		String str = "Rabinarayan Das";
		Map<Character, Integer> map = getFreqOfEachChar(str);
		System.out.println(map);
	}

	private static Map<Character, Integer> getFreqOfEachChar(String str) {
		Map<Character, Integer> map = new HashMap<>();
		char[] array = str.toCharArray();
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
