package com.example.java8CodingQuestion1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateNumberFromArray {
	
	public static int[] getDuplicateNumber(int[] array) {
		List<Integer> UniqueList = new ArrayList<>();
		List<Integer> list = Arrays.stream(array).boxed().
				filter(e->UniqueList.contains(e)?UniqueList.add(e):!UniqueList.add(e)).collect(Collectors.toList());
		int[] duplicateNum = list.stream().mapToInt(Integer::intValue).toArray();
		return duplicateNum;
	}
	public static void main(String[] args) {
       int[] array = {11,22,33,11,44,66,33,55};
       int[] duplicateNumber = getDuplicateNumber(array);
       System.out.println(Arrays.toString(duplicateNumber));
	}
}
