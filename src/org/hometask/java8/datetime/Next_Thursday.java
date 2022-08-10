package org.hometask.java8.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Next_Thursday {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println("Current date:" + " " + today);
		today = today.with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
		System.out.println("Next Thursday date:" + " " + today);
	}
}
