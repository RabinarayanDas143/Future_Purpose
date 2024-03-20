package com.example.java8Features.StreamApi;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindElementsExample {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		Optional<Integer> findfirst = list.stream().findFirst();
		if (findfirst.isPresent())
			System.out.println(findfirst.get());
		else
			System.out.println("findfirst is empty");

		Optional<Integer> findAny = list.stream().findAny();
		if (findAny.isPresent())
			System.out.println(findAny.get());
		else
			System.out.println("findAny is empty");
	}
}
