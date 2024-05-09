package com.example.java8CodingQuestion2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CommonElementBetweenTwoArray {
	
	public static List<Integer> getCommonElement(int[] array1,int[] array2){
		Predicate<Integer> predicate = e->Arrays.stream(array1).boxed().collect(Collectors.toList()).contains(e);
		List<Integer> list = Arrays.stream(array2).boxed().filter(predicate).collect(Collectors.toList());
		return list;
	}
	public static void main(String[] args) {
      int[] array1 = {1,2,3,4,5};
      int[] array2 = {1,2,3,4,5,6,7,8,9,10};
      
      List<Integer> commonElement = getCommonElement(array1,array2);
      System.out.println(commonElement);
	}
}
