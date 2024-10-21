package com.example.java8CodingQuestion6;

import java.util.Arrays;

public class SecondLargestFromArray6 {

	public static void main(String[] args) {
		int[] array = { 4, 1, 3, 2, 5, 6, 8, 7, 9, 10, 3, 6, 4, 5, 7, 8, 9 };
		int num = Arrays.stream(array).boxed().sorted((a, b) -> b - a).skip(1).findFirst().get();
		System.out.println(num);
	}

}
