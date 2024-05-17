package com.example.java8CodingQuestion2;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachCharFromString {
	
	public static Map<Character, Long> getFrequencyOfEachChar(String str){
		Map<Character, Long> map = str.chars().mapToObj(c->(char)c)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		return map;
	}
	public static void main(String[] args) {
        String str = "Rabinarayan Das";
        Map<Character, Long> map = getFrequencyOfEachChar(str);
        map.forEach((k,v)->System.out.println(k+"-->"+v));
	}
}
