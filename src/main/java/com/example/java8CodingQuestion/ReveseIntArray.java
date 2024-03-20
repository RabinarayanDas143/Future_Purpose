package com.example.java8CodingQuestion;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReveseIntArray {
public static void main(String[] args) {
	int[] intArray = {3,4,6,8,1,9};
	 int[] reverseArray=IntStream.rangeClosed(1, intArray.length).map(i->intArray[intArray.length-i]).toArray();
	 System.out.println(Arrays.toString(reverseArray));
}
}
