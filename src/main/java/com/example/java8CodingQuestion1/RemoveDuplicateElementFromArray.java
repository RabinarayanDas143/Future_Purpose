package com.example.java8CodingQuestion1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElementFromArray {
	
	public static List<String> removeDuplicate(String[] str){
		List<String> list= Arrays.stream(str).distinct().collect(Collectors.toList());
		return list;
	}
	public static void main(String[] args) {
        String[] array = {"Java","React","Java","React","Html","Css","Html"};
        List<String> list = removeDuplicate(array);
        System.out.println(list);
	}
}
