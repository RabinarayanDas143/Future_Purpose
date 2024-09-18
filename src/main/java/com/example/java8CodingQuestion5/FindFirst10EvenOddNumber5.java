package com.example.java8CodingQuestion5;

import java.util.Arrays;
import java.util.stream.Stream;

public class FindFirst10EvenOddNumber5 {

	public static void main(String[] args) {
		int[] evenarray = Stream.iterate(1, n -> n + 1).limit(10).filter(i -> i % 2 == 0).mapToInt(n -> n).toArray();
		int[] oddarray = Stream.iterate(1, n -> n + 1).limit(10).filter(i -> i % 2 != 0).mapToInt(n -> n).toArray();

		System.out.println(Arrays.toString(evenarray));
		System.out.println(Arrays.toString(oddarray));
	}

}
