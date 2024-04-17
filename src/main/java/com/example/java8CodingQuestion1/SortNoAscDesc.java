package com.example.java8CodingQuestion1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortNoAscDesc {
	public static int[] getAsec(int[] array) {
		int[] asec = Arrays.stream(array).distinct().sorted().toArray();
		return asec;
	}
	public static List<Integer> getDesc(int[] array) {
		List<Integer> desc =  Arrays.stream(array).boxed().distinct().sorted((a,b)->b-a).collect(Collectors.toList());
		return desc;
	}
	public static void main(String[] args) {
       int[] array = {1,3,2,3,4,5,6,8,7,2,8,3,9,10,3};
       int[] asec = getAsec(array);
       List<Integer> desc = getDesc(array);
       System.out.println(Arrays.toString(asec));
       System.out.println(desc);
	}
}
