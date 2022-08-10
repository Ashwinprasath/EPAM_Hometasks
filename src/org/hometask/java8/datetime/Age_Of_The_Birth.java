package org.hometask.java8.datetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Age_Of_The_Birth {

	public static void main(String[] args) {
		LocalDate DOB= LocalDate.of(1994,Month.AUGUST,9);
		LocalDate CurrentDate= LocalDate.now();
		
		Period period=Period.between(DOB, CurrentDate);
		System.out.printf("Age is"+" "+period.getYears()+" "+"years"+" "+period.getMonths()+" "+"months"+" "+period.getDays()+" "+"days");
		
	}
}
