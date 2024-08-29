package com.example.InterviewCoding6;

import java.util.HashMap;
import java.util.Map;

public class FrequencyofEachChar6 {

	public static void main(String[] args) {
		String str = "Rabinarayan  Das";
		Map<Character, Integer> freq = getFreqOfEachChar(str);
		System.out.println(freq);
	}

	private static Map<Character, Integer> getFreqOfEachChar(String str) {
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			if (map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			} else {
				map.put(str.charAt(i), 1);
			}
		}
		return map;
	}

}
