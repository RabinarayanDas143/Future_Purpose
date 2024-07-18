package com.example.InterviewCoding4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyOfEachChar4 {
	public static void main(String[] args) {
		String str = "Rabinarayan Das";
		Map<Character, Integer> map = getFrequencyOfEachChar(str);
		System.out.println(map);
 
	}

	
	private static Map<Character, Integer> getFrequencyOfEachChar(String str) {
		char[] charArray = str.toCharArray();
		List<Character> list = new ArrayList<>();
		for (Character c : charArray) {
			list.add(c);
		}
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < list.size(); i++) {
			map.putIfAbsent(list.get(i), Collections.frequency(list, list.get(i)));
		}
		return map;
	}
}
