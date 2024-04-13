package com.example.java8CodingQuestion1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EveneOdd1 {

	public static void getEvenOddFromArray(int[] array) {
		List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
		List<Integer> evenList = list.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
		List<Integer> oddList = list.stream().filter(e -> e % 2 != 0).collect(Collectors.toList());

		System.out.println("Evene number from array is :" + evenList);
		System.out.println("Odd number from array is :" + oddList);
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		getEvenOddFromArray(array);
	}
}
