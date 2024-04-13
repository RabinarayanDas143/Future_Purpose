package com.example.java8CodingQuestion1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate; 
import java.util.stream.Collectors;

public class CommonNumFrromTwoArray {

	public static int[] getCommonElement(int[] array1,int[] array2) {
		List<Integer> list = new ArrayList<>();
		for(int i: array1) {
			list.add(i);
		}
		Predicate<Integer> predicate = e->Arrays.stream(array2).boxed().collect(Collectors.toList()).contains(e);
		List<Integer> duplicate = list.stream().filter(predicate).collect(Collectors.toList());
		System.out.println(duplicate);
		return array2;
	}
	public static void main(String[] args) {
		int[] array1 = {1,2,4,5,3,7,6};
		int[] array2 = {3,9,5,77,88,33,66};
		int[] commonElement = getCommonElement(array1,array2);
	}
}
