package com.example.java8CodingQuestion2;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Find10OddNumber2 {
	
	public static int[] getOddNumber() {
		int[] oddArray = new int[10];
		oddArray = Stream.iterate(1, i->i+1).limit(10).filter(i->i%2!=0)
				.collect(Collectors.toList()).stream().mapToInt(i->i.intValue()).toArray();
		return oddArray;
	}
	public static void main(String[] args) {
      int[] oddNumber = getOddNumber();
      System.out.println(Arrays.toString(oddNumber));
	}
}
