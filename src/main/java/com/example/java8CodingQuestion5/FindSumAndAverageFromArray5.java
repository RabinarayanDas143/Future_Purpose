package com.example.java8CodingQuestion5;

import java.util.Arrays;
import java.util.OptionalDouble;

public class FindSumAndAverageFromArray5 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = Arrays.stream(array).boxed().mapToInt(e -> e).sum();
		OptionalDouble average = Arrays.stream(array).boxed().mapToInt(e -> e).average();

		System.out.println("Sum is :" + sum);
		System.out.println("Average is :" + average);
		
		int sum1 = Arrays.stream(array).boxed().reduce(0, (a,b)->a+b);
		System.out.println(sum1);
		
	    
	}

}
