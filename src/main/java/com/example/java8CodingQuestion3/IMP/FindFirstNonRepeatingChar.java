package com.example.java8CodingQuestion3.IMP;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatingChar {
	public static void main(String[] args) {
		String str = "Rabinarayan Das";
		Map<Character, Long> nonRepChar = getNonRepetingChar(str);
		Character nonRepChar8 = getNonRepetingChar8(str);
		// System.out.println(nonRepChar);
		System.out.println("-->" + nonRepChar8);
	}

	private static Character getNonRepetingChar8(String str) {
		// TODO Auto-generated method stub
		Character map = str.toUpperCase().chars().mapToObj(e -> (char) e)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(e -> e.getValue() == 1).map(Map.Entry::getKey).findFirst().orElse(null);
		return map;
	}

	private static Map<Character, Long> getNonRepetingChar(String str) {
		Map<Character, Long> map = str.toUpperCase().chars().mapToObj(e -> (char) e)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
		Map<Character, Long> nonRepChar = new HashMap<>();
		map.forEach((k, v) -> {
			if (v == 1) {
				if (nonRepChar.size() == 0) {
					nonRepChar.put(k, v);
				}
			}
		});
		return nonRepChar;
	}
}
