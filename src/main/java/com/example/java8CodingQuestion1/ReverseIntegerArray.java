package com.example.java8CodingQuestion1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseIntegerArray {
	
	public static int[] getRevArray(int[] array) {
		int[] revArray = IntStream.rangeClosed(1, array.length).map(e->array[array.length-e]).toArray();
		return revArray;
	}
	public static void main(String[] args) {
       int[] array = {2,3,4,5,6,7,8,9};
       int[] revArray = getRevArray(array);
       System.out.println(Arrays.toString(revArray));
	}
}
