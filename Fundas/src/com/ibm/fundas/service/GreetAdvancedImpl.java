package com.ibm.fundas.service;

import java.time.LocalDateTime;

public class GreetAdvancedImpl implements Greet {

	@Override
	public String greetWelcomeText(String visitorName) {
		String greeting="";
		LocalDateTime today=LocalDateTime.now();
		int currentHour=today.getHour();
		if(currentHour>=1 && currentHour<=11) {
			greeting="Good Morning";
		}else if(currentHour>=12 && currentHour<=15) {
			greeting="Good Afternoon";
		}else {greeting="Good Evening";}
		return greeting + visitorName;
	}

}
