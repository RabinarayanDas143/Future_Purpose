package com.example.java8Features;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

@FunctionalInterface
interface Printable {
	void print(String msg);
}

public class MethodReferenceDemo {

	public static int addition(int a, int b) {
		return a + b;
	}

	public void display(String msg) {
		msg = msg.toUpperCase();
		System.out.println(msg);
	}

	public static void main(String[] args) {
		// 1. Method Reference to a static method
		// using lambda expression
		Function<Integer, Double> function = (input) -> {
			return Math.sqrt(input);
		};
		// System.out.println(function.apply(4));

		// using Method reference
		Function<Integer, Double> funMeth = Math::sqrt;
		// System.out.println(funMeth.apply(4));

		// lambda expression
		BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> {
			return MethodReferenceDemo.addition(a, b);
		};
		// System.out.println(biFunction.apply(10, 40));

		// using Method Reference
		BiFunction<Integer, Integer, Integer> biFunction2 = MethodReferenceDemo::addition;
		// System.out.println(biFunction2.apply(50, 50));

		// 2. Method Reference to an instance method of an object .
		// using lambda expression
		MethodReferenceDemo obj = new MethodReferenceDemo();
		Printable printable = (msg) -> {
			obj.display(msg);
		};
		//System.out.println("Hello");
		
		// using Method reference .
		Printable print = obj::display;
		//print.print("Hello world");
		
		//3.Reference to the instance method of an arbitary object 
		  // some times we call a method of argument in lambda expression 
		  // in that case , we can use a method reference to call an instance 
		  // method of an arbitary object of a specific type .
		// using lambda expression
		Function<String, String> stringfunction =(input)->{
			return input.toUpperCase();
		};
		//System.out.println(stringfunction.apply("helloworld"));
		
		// using method reference 
		Function<String, String> fun = String::toLowerCase;
		//System.out.println(fun.apply("HELLOWORLD"));
		
		//4. Reference to a constructor
		List<String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add("bannana");
		fruits.add("orange");
		fruits.add("watermelon");
		
//		Function<List<String>, Set<String>> setfunction =(fruitList)->{
//			return new HashSet<>(fruitList);
//		};
		//System.out.println(setfunction.apply(fruits));

		Function<List<String>, Set<String>> setfunction1 = HashSet::new;
		System.out.println(setfunction1.apply(fruits));
	}

}
