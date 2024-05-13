package com.example.java8CodingQuestion2;

import java.util.Arrays;

public class FindSumAndAverageFromArray2 {
	
	public static int getSum(int[] array) {
		int result = Arrays.stream(array).sum();
		return result;
	}
	
	public static Double getAverage(int[] array) {
		double result = Arrays.stream(array).average().getAsDouble();
		return result;
	} 
	
	public static void main(String[] args) {
       int[] array = {1,2,3,4,5,6,7,8,9};
       
       int sum = getSum(array);
       System.out.println("sum is :"+sum);
       
       double averag = getAverage(array);
       System.out.println(averag);
	}
}
