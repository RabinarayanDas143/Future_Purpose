package com.example.java8CodingQuestion1;

import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostRepeatElementInList1 {
	public static void main(String[] args) {
		String[] str = { "Java", "python", "React", "Java", "Java", "React" };
		Map<String, Long> map = Arrays.stream(str)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		Map<String, Long> mostfreEntry = (Map<String, Long>) map.entrySet().stream().max(Map.Entry.comparingByValue()).get();
		//System.out.println(mostfreEntry.getKey() + ":" + mostfreEntry.getValue());
	}
}
