package com.example.java8Features;

import java.util.Optional;

public class OptionalClass {
	public static void main(String[] args) {
		// of,empty,ofNullable
		Optional<Object> empOptional = Optional.empty();
		// System.out.println(empOptional);

		String email = "das123@gmail.com";
		String nullemail = null;
		// Optional<String> check=Optional.of(nullemail);
		// System.out.println(check);

		Optional<String> isCheck = Optional.ofNullable(email);
//		if(isCheck.isEmpty()) {
//			System.out.println("Empty email");
//		}else {
//			System.out.println(isCheck.get());
//		}
		if (isCheck.isPresent()) {
			// System.out.println(isCheck.get());
		} else {
			// System.out.println("email is empty");
			String s = isCheck.orElse("Hello world");
			// System.out.println(s);
		}

		String optionalObject = isCheck.orElseThrow(() -> new IllegalArgumentException("Email is not present"));
		// System.out.println(optionalObject);

		Optional<String> obj1 = Optional.of("Rabinarayan Das");
		Optional<String> obj2 = Optional.empty();

		// obj1.ifPresent((s)->System.out.println("value is present"));
		// obj2.ifPresent((s)->System.out.println("value is not present"));

		String str = "  RabinarayanDas  ";
		Optional<String> obj3 = Optional.of(str);

		obj3.filter((res) -> res.contains("RabinarayanDas")).map((res) -> res.trim())
				.ifPresent((s) -> System.out.println(s));
		String result = " abc ";
		Optional<String> filterMethod = Optional.of(result);
		filterMethod.filter((res)->res.contains("a")).map(String::trim)
		                         .ifPresent((s)->System.out.println(s));
		
	}
}
