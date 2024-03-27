package com.example.InterviewCoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindMissingNumber {
	public static void main(String[] args) {
		int array[] = { 1, 2, 2, 5, 7, 8, 10, 5, 1 };

		// find frequency
		List<Integer> freqList = Arrays.stream(array).boxed().collect(Collectors.toList());
		Map<Integer, Long> freqMap = freqList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		//freqMap.forEach((k, v) -> System.out.println(k + ":" + v));
		
		// Find Missing 
		// it create a list 1-10 
		List<Integer> intList= Stream.iterate(1, n->n+1).limit(10).collect(Collectors.toList());
		Set<Integer> set = new HashSet<>();
		for(int i:array) {
			set.add(i);
		}
		List<Integer> missingValue=new ArrayList<>();
		for(int i: intList) {
			if(!set.contains(i)) {
				missingValue.add(i);
			}
		}
		System.out.println("Missing numbers from array are :"+missingValue);
	}
}
