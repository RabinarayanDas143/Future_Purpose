package com.example.java8CodingQuestion6;

import java.time.LocalDate;
import java.time.Period;

public class FindAge6 {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate birth = LocalDate.of(1998, 02, 8);

		Period age = Period.between(today, birth);
		System.out.println(age);
	}

}
