package com.example.java8CodingQuestion2;

import java.util.Arrays;

public class SecondLargestFromArray {
	public static void main(String[] args) {
       int[] array = {1,4,2,3,5,6,4,7,5,8,7,10,9};
       
       int secondLargest = Arrays.stream(array).boxed().distinct().sorted((a,b)->b-a).skip(1).findFirst().get();
       System.out.println(secondLargest);
	}
}
