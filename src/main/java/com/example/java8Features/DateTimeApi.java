package com.example.java8Features;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

import org.springframework.format.annotation.DateTimeFormat;

public class DateTimeApi {
	public static void main(String[] args) {
		ZonedDateTime ZonedTime = ZonedDateTime.now();
		// System.out.println(ZonedTime);

		Set<String> zoneid = ZoneId.getAvailableZoneIds();
		// zoneid.forEach(System.out::println);

		ZonedDateTime time = ZonedDateTime.now(ZoneId.of("Europe/Monaco"));
		// System.out.println(time);
		
		LocalDate today=LocalDate.now();
		LocalDate bDay=LocalDate.of(1998, 2, 8);
		//System.out.println("My Age is: "+Period.between(today, bDay));
		
		LocalDate today1=LocalDate.now();
		LocalDate bDay1=LocalDate.of(2002, 1, 27);
		//System.out.println("Moti Age is: "+Period.between(today1, bDay1));
		
		String date = "11/03/2024";
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate convertDate =LocalDate.parse(date,format);
		//System.out.println(convertDate);
		
		LocalDate date1 = LocalDate.now();
		System.out.println(date1);
		
		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println(date1.format(format1));
	}
}
