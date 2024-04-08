package com.example.InterviewCoding1;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyOfWord1 {

	public static void main(String[] args) {
		String str = "I am a Java Developer and a Developer";

		String[] strArray = str.split(" ");

		List<String> listStr = Arrays.asList(strArray);

		Map<String, Integer> map = new HashMap<>();

		for (String word : listStr) {
			map.putIfAbsent(word, Collections.frequency(listStr, word));
		}
		System.out.println(map);
	}
}
