package com.example.java8CodingQuestion5;

import java.util.Arrays;
import java.util.Comparator;

public class FindFirstandLast3Number {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] first3Num = Arrays.stream(array).boxed().distinct().sorted().limit(3).mapToInt(e -> e).toArray();
		int[] last3Num = Arrays.stream(array).boxed().distinct().sorted((a, b) -> b - a).limit(3).mapToInt(e -> e)
				.toArray();
        System.out.println("First 3 Num :"+ Arrays.toString(first3Num));
        System.out.println("Last 3 Num :"+ Arrays.toString(last3Num));
	}

}
