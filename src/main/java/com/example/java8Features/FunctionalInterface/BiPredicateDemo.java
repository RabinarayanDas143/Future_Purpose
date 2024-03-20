package com.example.java8Features.FunctionalInterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class BiPredicateDemo implements BiPredicate<String, String> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiPredicate<String, String> obj = new BiPredicateDemo();
		//System.out.println(obj.test("Rabi", "Rabii"));
		// BiPredicate function take two argument and return boolean value
		BiPredicate<String, String> obj1 = new BiPredicate<String, String>() {
			
			@Override
			public boolean test(String t, String u) {
				// TODO Auto-generated method stub
				return t.contains(u);
			}
		};
		//System.out.println(obj1.test("Rabinarayan", "r"));
		
		BiPredicate<String, String> obj3 = (a,b)->{return a.equals(b);};
		//System.out.println(obj3.test("rabi", "rabi"));
		
		Predicate<String> obj4 = new Predicate<String>() {
			
			@Override
			public boolean test(String t) {
				// TODO Auto-generated method stub
				return false;
			}
		};
	}

	@Override
	public boolean test(String s1, String s2) {
		// TODO Auto-generated method stub
		return s1.equals(s2);
	}

}
