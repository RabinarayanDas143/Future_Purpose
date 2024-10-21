package com.example.java8CodingQuestion6;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SumOfAllDigists6 {

	public static void main(String[] args) {
		String str = "123";
        int num = Arrays.stream(str.split("")).collect(Collectors.summingInt(e->Integer.parseInt(e)));
        System.out.println(num);
        
        int num1 = Arrays.stream(str.split("")).mapToInt(e->Integer.parseInt(e)).boxed().reduce(0, (a,b)->a+b);
        System.out.println(num1);
	}

}
