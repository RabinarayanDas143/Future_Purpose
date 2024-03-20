package com.example.java8CodingQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOdd {

	private static EvenOdd evenOdd;
	
	private EvenOdd() {
		if(evenOdd!=null) {
			throw new RuntimeException("You are violate the Singleton rule");
		}
	}
	
	private static EvenOdd getEvenOddObj() {
		if(evenOdd==null) {
			synchronized (EvenOdd.class) {
				if(evenOdd==null) {
					evenOdd=new EvenOdd();
				}
			}
		}
		return evenOdd;
	}
	
	public void evenOdd(List<Integer> list) {
		List<Integer> evenno=null;
		List<Integer> oddno=null;
		
		evenno= list.stream().filter((i)->i%2==0).collect(Collectors.toList());
		System.out.println("even numbers is :"+evenno);
		
		oddno=list.stream().filter((i)->i%2!=0).collect(Collectors.toList());
		System.out.println("Odd numbers is :"+oddno);
		
		 
	}
	
	public static void main(String [] args) {
		EvenOdd obj = getEvenOddObj();
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,89,10,22,35);
		obj.evenOdd(list);
	}
}
