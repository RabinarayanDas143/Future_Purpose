package com.example.InterviewCoding7;

import java.util.HashMap;
import java.util.Map;

public class CountVowelAndConsonant {

	public static void main(String[] args) {
		String str = "Rabinarayan Das";
		Map<String, Integer> result = countVowelAndConsonants(str);
		System.out.println(result);
	}

	private static Map<String, Integer> countVowelAndConsonants(String str) {
		Map<String, Integer> result = new HashMap<>();
		int vowel = 0, consonants = 0;
		for (int i = 0; i < str.length(); i++) {
			char input = str.toLowerCase().charAt(i);
			if (input != ' ') {
				if (input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u') {
					vowel++;
				} else {
					consonants++;
				}
			}
		}
		result.put("Vowels", vowel);
		result.put("Consonants", consonants);
		return result;
	}

}
