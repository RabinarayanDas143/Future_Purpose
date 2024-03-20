package com.example.java8CodingQuestion;

import java.time.LocalDate;
import java.time.Period;

public class FindTheAge {
	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		LocalDate bday = LocalDate.of(1998, 2, 8);
		
		Period MyBday = Period.between(today, bday);
		System.out.println(MyBday);
	}
}
