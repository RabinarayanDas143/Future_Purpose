package com.example.java8CodingQuestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachElement {

	// This method for count each element from Array
	public void frequencyOfEachElement(String[] strArray) {
		List<String> listStr = new ArrayList<>();
		for (String str : strArray) {
			listStr.add(str);
		}
		Map<String, Integer> map = new HashMap<>();
		for (String str : listStr) {
			map.putIfAbsent(str, Collections.frequency(listStr, str));
		}
		System.out.println(map);
	}

	// This method for count each element from Array using Java8
	public void frequencyOfEachElementJava8(String[] strArray) {
		List<String> list = new ArrayList<>();
		for (String str : strArray)
			list.add(str);
		Map<String, Long> map = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map);
	}

	public static void main(String[] args) {
		FrequencyOfEachElement obj = new FrequencyOfEachElement();
		String[] str = { "Rabi", "Raja", "Ankit", "Rabi", "Himesh", "Ankit", "Shyam", "John", "Shyam" };
		//obj.frequencyOfEachElement(str);
		obj.frequencyOfEachElementJava8(str);
	}
}
