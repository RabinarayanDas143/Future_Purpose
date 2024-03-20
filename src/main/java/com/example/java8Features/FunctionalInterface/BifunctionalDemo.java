package com.example.java8Features.FunctionalInterface;

import java.util.function.BiFunction;

public class BifunctionalDemo implements BiFunction<Integer, Integer, Integer> {

	@Override
	public Integer apply(Integer t, Integer u) {
		// TODO Auto-generated method stub
		return (t + u);
	}

	public static void main(String[] args) {
		// normal way
		BiFunction obj = new BifunctionalDemo();
		// System.out.println(obj.apply(10, 20));

		// using annonymous class concept .
		// Annonymous class is a class that have no name 
		// and it is used to implement the interface .

		BiFunction<Integer, Integer, Integer> obj1 = new BiFunction<Integer, Integer, Integer>() {

			@Override
			public Integer apply(Integer t, Integer u) {
				// TODO Auto-generated method stub
				return (t + u);
			}
		};
		
		//System.out.println(obj1.apply(10, 50));
		
		//using lambda expression 
		BiFunction<Integer, Integer, Integer> bifun = (t,u)->{return (t+u);};
		System.out.println(bifun.apply(10, 55));
	}

}
