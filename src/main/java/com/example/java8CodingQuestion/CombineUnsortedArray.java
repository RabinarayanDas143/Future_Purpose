package com.example.java8CodingQuestion;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.IntStream;


public class CombineUnsortedArray {
public static void main(String[] args) {
	int [] a = {2,3,5,8,6,5};
	int[] b = {2,5,8,9,5,6,3,1};
	int [] c= IntStream.concat(Arrays.stream(a), Arrays.stream(b))
			   .sorted()
			   .distinct()
			   .toArray();
	
//	Set<Integer> set = new TreeSet<Integer>();
//	for(int i:c) {
//		set.add(i);
//	}
	
	System.out.println("Sorted of two unsorted array "+Arrays.toString(c));
}
}
