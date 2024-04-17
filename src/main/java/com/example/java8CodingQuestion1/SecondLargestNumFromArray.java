package com.example.java8CodingQuestion1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondLargestNumFromArray {
	public static int getSecondLargest(int[] array) {
		List<Integer> list = new ArrayList<>();
		for(int i: array) {
			list.add(i);
		}
		int secondLargest = list.stream().distinct().sorted((a,b)->b-a).skip(1).findFirst().get();
		return secondLargest;
	}
	public static void main(String[] args) {
       int[] array = {1,2,3,1,4,2,5,6,7,3,8,5,9,7,5,10};
       int secondLargest = getSecondLargest(array);
       System.out.println(secondLargest);
	}
}
