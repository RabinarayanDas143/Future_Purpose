package com.example.java8CodingQuestion2;

import java.time.LocalDate;
import java.time.Period;

import org.springframework.cglib.core.Local;

import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;

public class FindTheAge {
	public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate bday = LocalDate.of(1987, 05, 8);
        
        Period period = Period.between(today, bday);
        System.out.println(period);
	}
}
