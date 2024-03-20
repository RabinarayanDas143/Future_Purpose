package com.example.InterviewCoding;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateWordInSentence {
	public static void main(String[] args) {
		String sentence = "The quick brown fox jumps over the lazy dog fox jumps";

		String[] word = sentence.split(" ");

		List<String> list = Arrays.asList(word);

		Map<String, Integer> map = new HashMap<>();
		for (String str : list) {
			map.putIfAbsent(str, Collections.frequency(list, str));
		}
		//System.out.println(map);
		for (Entry<String, Integer> mp : map.entrySet()) {
			//System.out.println(mp.getKey() + ":" + mp.getValue());
		}
		// using java8
		Map<String, Long> str=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(str);
	}
}
