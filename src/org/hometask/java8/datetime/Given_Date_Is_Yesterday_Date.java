package org.hometask.java8.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.function.Predicate;

public class Given_Date_Is_Yesterday_Date {

	public static void main(String [] args) {
		LocalDate date = LocalDate.now();
		
		String yesterday= (date.minusDays(1)).format(DateTimeFormatter.ISO_DATE);
		
		Predicate<String> pDate= Predicate.isEqual(yesterday);
		if(pDate.test(yesterday))
		{
			System.out.println("Yesterday's date is : "+yesterday);
		}
	}
}
