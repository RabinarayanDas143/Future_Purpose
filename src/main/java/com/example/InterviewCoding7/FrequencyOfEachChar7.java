package com.example.InterviewCoding7;
import java.util.HashMap;
import java.util.Map;

public class FrequencyOfEachChar7 {

	public static void main(String[] args) {
		String str = "Rabinarayan Das";
		Map<Character, Integer> result = getFrequencyOfEachChar(str);
		System.out.println(result);
	}

	private static Map<Character, Integer> getFrequencyOfEachChar(String str) {
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
