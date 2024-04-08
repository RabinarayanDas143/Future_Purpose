package com.example.InterviewCoding1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindFrequencyAndMissing {

	public static void main(String[] args) {
		
		int[] array = {1,2,2,5,2,6,9,10,1,5,6};
		
		// find frequency
		List<Integer> list = new ArrayList<>();
		for(int i:array) {
			list.add(i);
		}
		Map<Integer, Integer> map = new HashMap<>();
		for(int i: list) {
			map.putIfAbsent(i, Collections.frequency(list, i));
		}
		//System.out.println("frequency is "+map);
		
		// find frequency using java 8
		
		List<Integer> intList = Arrays.stream(array).boxed().collect(Collectors.toList());
		Map<Integer, Long> freqList = intList.stream()
				                      .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		//System.out.println("frequency using java 8 :"+ freqList);
		
		
		// finding the missing number
		Set<Integer> set = new HashSet<>();
		for(int i:array) {
			set.add(i);
		}
		List<Integer> numberList = Stream.iterate(1, n->n+1).limit(10).collect(Collectors.toList());
		List<Integer> missingValue = new ArrayList<>();
		for(int i:numberList) {
			if(!set.contains(i)) {
				missingValue.add(i);
			}
		}
		System.out.println("mising number is :"+missingValue);
	}
}
