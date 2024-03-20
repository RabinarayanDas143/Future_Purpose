package com.example.java8CodingQuestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostRepetedElement {
	public static void main(String[] args) {
		// using java 1.7
//		String[] strArray = { "Java", "Python", "React", "Java", "React", ".Net", "Java" };
//
//		List<String> list = new ArrayList<>();
//		for (String str : strArray) {
//			list.add(str);
//		}
//		Map<String, Integer> map = new HashMap<>();
//
//		for (String str : list) {
//			map.putIfAbsent(str, Collections.frequency(list, str));
//		}
//		String word = null;
//		int count = 0;
//		for (Entry<String, Integer> result : map.entrySet()) {
//			if (result.getValue() > count) {
//				count = result.getValue();
//				word = result.getKey();
//			}
//		}
//		//System.out.println(word + ":" + count);

		// using java 1.8

		String[] strArray = { "Java", "Python", "React", "Java", "React", ".Net", "Java" };
		List<String> list = new ArrayList<>();
		for (String str : strArray) {
			list.add(str);
		}

		Map<String, Long> streamList = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		Entry<String, Long> mostFrequenty = streamList.entrySet().stream().max(Map.Entry.comparingByValue()).get();
		System.out.println(mostFrequenty.getKey() + ":" + mostFrequenty.getValue());
	}
}
