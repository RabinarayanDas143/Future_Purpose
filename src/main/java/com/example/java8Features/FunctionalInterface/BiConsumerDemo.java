package com.example.java8Features.FunctionalInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class BiConsumerDemo implements BiConsumer<Integer, Integer> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiConsumer<Integer, Integer> obj = new BiConsumerDemo();
		//obj.accept(10, 20);
		
		BiConsumer<Integer, Integer> obj1 = new BiConsumer<Integer, Integer>() {
			
			@Override
			public void accept(Integer t, Integer u) {
				// TODO Auto-generated method stub
				System.out.println(t+u);
			}
		};
		//obj1.accept(50, 40);
		//Biconsumer take two argument
		BiConsumer<Integer, Integer> obj2 = (t,u)->{System.out.println(t+u);};
		//obj2.accept(10, 10);
		
		// consumer interface take one argument
		Consumer<Integer> obj3 = new Consumer<Integer>() {
			
			@Override
			public void accept(Integer t) {
				// TODO Auto-generated method stub
				System.out.println("INside Consumer annonymous class :"+t);
			}
		};
		 //obj3.accept(10);
		
		Map<Integer, String> map =new HashMap<Integer, String>();
		map.put(1, "java");
		map.put(2, "JavaScript");
		map.put(3, "React");
		
		map.forEach((k,v)->{
			System.out.println(k);
			System.out.println(v);
		});
	}

	@Override
	public void accept(Integer t, Integer u) {
		// TODO Auto-generated method stub
		System.out.println(t + u);
	}

}
