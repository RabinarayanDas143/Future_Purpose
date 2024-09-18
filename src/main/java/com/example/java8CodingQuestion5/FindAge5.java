package com.example.java8CodingQuestion5;

import java.time.LocalDate;
import java.time.Period;

public class FindAge5 {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate bday = LocalDate.of(1998, 02, 8);

		Period period = Period.between(today, bday);
		System.out.println(period);
	}

}
