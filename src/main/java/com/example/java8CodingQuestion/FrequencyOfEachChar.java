package com.example.java8CodingQuestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachChar {

	private static FrequencyOfEachChar frequencyOfEachChar;

	private FrequencyOfEachChar() {
		if (frequencyOfEachChar != null) {
			throw new RuntimeException("Violence the Singleton rule");
		}
	}

	public static FrequencyOfEachChar getFrequencyOfEachCharObj() {
		if (frequencyOfEachChar == null) {
			synchronized (FrequencyOfEachChar.class) {
				if (frequencyOfEachChar == null) {
					frequencyOfEachChar = new FrequencyOfEachChar();
				}
			}
		}
		return frequencyOfEachChar;
	}

	// This method for get frequency of each character .
	public void frequencyCheck(String str) {
		char[] ch = str.toCharArray();

		List<Character> listChar = new ArrayList<>();
		for (char c : ch) {
			listChar.add(c);
		}

		Map<Character, Integer> map = new HashMap<>();
		for (char c : listChar) {
			map.putIfAbsent(c, Collections.frequency(listChar, c));
		}
		System.out.println(map);

		char fequencyChar = '0';
		int frequencyNum = 0;

		for (Entry<Character, Integer> result : map.entrySet()) {
			if (result.getValue() > frequencyNum) {
				fequencyChar = result.getKey();
				frequencyNum = result.getValue();
			}
		}
		System.out.println("Also largest frequency of character is :" + fequencyChar + "=" + frequencyNum);
	}

	// This method for get frequency of only one character
	public void getSingleCharFrequency(String str, char c) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == c)
				count++;
		}
		System.out.println("Count of you character is :" + c + "=" + count);
	}

// This method for frequency of each character using java8
	public void frequencyOfEachCharUseByJava8(String str) {
		Map<Character, Long> map = str.chars().mapToObj((c) -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		map.forEach((k, v) -> {
			System.out.println(k + "=" + v);
		});
	}

	public static void main(String[] args) {
		FrequencyOfEachChar obj = getFrequencyOfEachCharObj();
		// obj.frequencyCheck("Rabinarayan Das");
		// obj.getSingleCharFrequency("Rabinarayan Das", 'n');
		obj.frequencyOfEachCharUseByJava8("Rabinarayan Das");
	}

}
