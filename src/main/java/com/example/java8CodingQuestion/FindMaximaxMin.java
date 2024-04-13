package com.example.java8CodingQuestion;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindMaximaxMin {
	public void maxMin(List<Integer> list) {
		int max = list.get(0);
		int min = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			if (max < list.get(i)) {
				max = list.get(i);
			} else {
				min = list.get(i);
			}
		}
		System.out.println("from list Max no is :" + max + "  and Min no is :" + min);
	}
	
	public void maxMinUseJava8(List<Integer> list) {
		int Max = list.stream().max((a,b)->a-b).get();
		int Min = list.stream().min(Comparator.naturalOrder()).get();
		
		System.out.println("From your list max no is :"+Max+" and min no is :"+Min);
		
	}
	
	public static void main(String[] args) {
		FindMaximaxMin obj= new FindMaximaxMin();
		List<Integer> list = Arrays.asList(2,4,6,3,7,8,10,1);
		//obj.maxMin(list);
		obj.maxMinUseJava8(list);
	}
}
