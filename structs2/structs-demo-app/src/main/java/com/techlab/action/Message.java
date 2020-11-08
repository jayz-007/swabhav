package com.techlab.action;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Message {

	public String getMessage() {
		Calendar c = Calendar.getInstance();
		int currentTime = c.get(Calendar.HOUR_OF_DAY);
		String date = new SimpleDateFormat("dd/MM/yyy").format(c);
		if (currentTime >= 0 && currentTime < 12) {
			return "Good Morning current time is" +date;
		}
		if (currentTime >= 12 && currentTime < 6) {
			return "Good Afternoon current time is" + date;
		}
		return "Good Evening current time is " + date;

	}
	
}
