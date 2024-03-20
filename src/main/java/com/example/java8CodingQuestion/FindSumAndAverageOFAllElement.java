package com.example.java8CodingQuestion;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FindSumAndAverageOFAllElement {
public static void main(String[] args) {
	int[] intArray = {2,4,5,7,6,8,9};
	
	int sum = Arrays.stream(intArray).sum();
	System.out.println("Sum is :"+sum);
	
	double average = Arrays.stream(intArray).average().getAsDouble();
	
	System.out.println("average is :"+average);
}
}
