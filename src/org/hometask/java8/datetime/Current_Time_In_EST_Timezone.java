package org.hometask.java8.datetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Current_Time_In_EST_Timezone {

	public static void main(String[] args) {

		ZoneId EST = ZoneId.of("America/New_York");
		ZonedDateTime datetime = ZonedDateTime.now(EST);
		System.out.println(datetime);
	}
}
