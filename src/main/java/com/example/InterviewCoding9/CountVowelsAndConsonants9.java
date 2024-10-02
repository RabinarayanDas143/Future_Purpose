package com.example.InterviewCoding9;

import java.util.HashMap;
import java.util.Map;

public class CountVowelsAndConsonants9 {

	public static void main(String[] args) {
		String str = "Rabinarayan Das";
		Map<String, Integer> map = getCountVowelsAndConsonants(str);
		System.out.println(map);
	}

	private static Map<String, Integer> getCountVowelsAndConsonants(String str) {
		int vowels = 0, consonants = 0;
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < str.toLowerCase().length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowels++;
			} else {
				consonants++;
			}
		}
		map.put("Vowels", vowels);
		map.put("Consonants", consonants);
		return map;
	}

}
