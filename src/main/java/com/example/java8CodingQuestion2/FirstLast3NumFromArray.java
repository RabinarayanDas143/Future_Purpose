package com.example.java8CodingQuestion2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FirstLast3NumFromArray {
	public static void main(String[] args) {
         int[] array = {3,4,2,1,5,7,6,8,7,9,10,3,6,1,10};
         
         int[] first3Num = Arrays.stream(array).boxed().distinct().sorted().limit(3)
        		 .collect(Collectors.toList()).stream().mapToInt(e->e.intValue()).toArray();
         int[] last3Num = Arrays.stream(array).boxed().distinct().sorted((a,b)->b-a).limit(3)
        		 .collect(Collectors.toList()).stream().mapToInt(e->e.intValue()).toArray();
         
         System.out.println("First 3 number is :"+Arrays.toString(first3Num)  +"and last 3 number is :"+Arrays.toString(last3Num));
	}
}
