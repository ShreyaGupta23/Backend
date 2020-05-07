package com.ibm.fundas.ui;
import com.ibm.fundas.service.*;
public class InterDemo {
public static void main(String[] args) {
	Greet g1= new GreetStandardImpl();
	Greet g2= new GreetAdvancedImpl();
	System.out.println(g1.greetWelcomeText("Shreya"));
	System.out.println(g2.greetWelcomeText("Shreya"));
	System.out.println(g1.greetThankYouText("Shreya"));
	System.out.println(g2.greetThankYouText("Shreya"));
}
}
