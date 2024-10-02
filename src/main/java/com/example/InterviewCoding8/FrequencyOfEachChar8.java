package com.example.InterviewCoding8;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfEachChar8 {

	public static void main(String[] args) {
		String str = "Rabinarayan Das";
		Map<Character, Integer> map = getFreqOfEachChar(str);
		System.out.println(map);
	}

	private static Map<Character, Integer> getFreqOfEachChar(String str) {
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
		return map;
	}

}
