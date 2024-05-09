package com.example.java8CodingQuestion2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOdd2 {
	public static List<Map<String, List<Integer>>> getEvenOdd(int[] array) {
		List<Integer> even = Arrays.stream(array).boxed().filter(e -> e % 2 == 0).collect(Collectors.toList());
		List<Integer> odd = Arrays.stream(array).boxed().filter(e -> e % 2 != 0).collect(Collectors.toList());
		List<Map<String, List<Integer>>> list = new ArrayList<>();
		Map<String, List<Integer>> map = new HashMap<>();
		map.put("Even No", even);
		map.put("Odd No", odd);
		list.add(map);
		return list;
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		List<Map<String, List<Integer>>> list = getEvenOdd(array);
		System.out.println(list);
	}
}
