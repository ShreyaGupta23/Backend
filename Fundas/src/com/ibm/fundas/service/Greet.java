package com.ibm.fundas.service;

public interface Greet {
String greetWelcomeText(String visitorName);
default String greetThankYouText(String visitorName)
{
	return "Thank You" + visitorName + "!Please visit again";}
}
