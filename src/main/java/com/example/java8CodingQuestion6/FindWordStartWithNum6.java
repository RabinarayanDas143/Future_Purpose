package com.example.java8CodingQuestion6;

import java.util.Arrays;

public class FindWordStartWithNum6 {

	public static void main(String[] args) {
		String[] strArray = { "8java", "java", "9Python", "4Mysql", "Oracle" };
		Object[] result = Arrays.stream(strArray).filter(e -> Character.isDigit(e.charAt(0))).toArray();
		System.out.println(Arrays.toString(result));
	}

}
