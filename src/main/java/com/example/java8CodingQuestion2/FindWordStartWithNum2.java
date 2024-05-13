package com.example.java8CodingQuestion2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindWordStartWithNum2 {

	public static List<String> getWordStartwithNum(String[] array) {
		List<String> list = new ArrayList<>();
		list = Arrays.stream(array).filter(e -> Character.isDigit(e.charAt(0))).collect(Collectors.toList());
		return list;
	}

	public static void main(String[] args) {
		String[] array = { "Java", "5ReactJs", ".Net", "8Python" };
		List<String> resltArray = getWordStartwithNum(array);
		System.out.println(resltArray);
	}
}
