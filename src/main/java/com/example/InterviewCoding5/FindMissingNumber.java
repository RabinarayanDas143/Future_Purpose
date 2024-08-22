package com.example.InterviewCoding5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindMissingNumber {

	public static void main(String[] args) {
		int[] array = { 1, 3, 5, 8, 10 };
		// 2,4,6,7,9
		int min = Arrays.stream(array).min().getAsInt();
		int max = Arrays.stream(array).max().getAsInt();
		List<Integer> list = IntStream.iterate(min, n -> n + 1).limit(max).boxed().collect(Collectors.toList());
		List<Integer> missing = new ArrayList<>();
		List<Integer> arraylist = new ArrayList<>();
		
		for(int i : array) {
			arraylist.add(i);
		}
		for(int i:list) {
			if(!arraylist.contains(i)) {
				missing.add(i);
			}
		}
		System.out.println("Missing number is : "+missing);
	}

}
