package com.example.java8CodingQuestion1;

import java.time.LocalDate;
import java.time.Period;

public class FindTheAge {
	public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate bday = LocalDate.of(1998, 05, 23);
        
        Period period = Period.between(today, bday);
        System.out.println(period);
	}
}
