package com.example.java8Features.StreamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindMinMaxCount {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		int count=(int) list.stream().count();
		System.out.println(count);
		
		Integer minnum= list.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(minnum);
		
		Integer maxnum = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(maxnum);
	}
}
