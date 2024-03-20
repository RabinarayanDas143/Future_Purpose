package com.example.java8CodingQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum RemoveDuplicateElement {
	INSTANCE;

	public void removeDuplicate(List<String> list) {
		List<String> removeDuplicate=null;
		removeDuplicate=list.stream().distinct().collect(Collectors.toList());
		System.out.println(removeDuplicate);
	}
	public static void main(String[] args) {
		RemoveDuplicateElement obj = RemoveDuplicateElement.INSTANCE;
		List<String> list = Arrays.asList("Java","Python","React","C","Java","React","Python");
		obj.removeDuplicate(list);
	}
}
