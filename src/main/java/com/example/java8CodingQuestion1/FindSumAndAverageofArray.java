package com.example.java8CodingQuestion1;

import java.util.Arrays;

public class FindSumAndAverageofArray {
	public static int getSumOfArray(int[] array) {
		int sum = Arrays.stream(array).sum();
		return sum;
	}

	public static double getAverageFromArray(int[] array) {
		double averageValue = Arrays.stream(array).average().getAsDouble();
		return averageValue;
	}

	public static void main(String[] args) {
		int[] intArray = { 2, 4, 5, 7, 1, 4 };
		int sum = getSumOfArray(intArray);
		System.out.println("sum is :" + sum);

		double average = getAverageFromArray(intArray);
		System.out.println("Average is :" + average);
	}
}
