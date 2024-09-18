package com.example.java8CodingQuestion5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateNumberFromArray5 {

	public static void main(String[] args) {
		int[] array = { 1, 4, 2, 3, 5, 6, 7, 3, 4, 5 };
		List<Integer> list = new ArrayList<>();
		int[] duplicate = Arrays.stream(array).boxed().filter(e -> list.contains(e) ? list.add(e) : !list.add(e))
				.collect(Collectors.toList()).stream().mapToInt(e -> e).toArray();
		System.out.println(Arrays.toString(duplicate));
	}

}
