package com.ibm.fundas.ui;
import com.ibm.fundas.model.*;
public class Demo3ab {
public static void main(String[] args)
{
	Faculty f= new Faculty("Shreya","Gupta",12000);
	System.out.println(f.toString());
	SalesExecutive s = new SalesExecutive("Muskan","Singhal",12000);
	System.out.println(s.toString());
	}
}
