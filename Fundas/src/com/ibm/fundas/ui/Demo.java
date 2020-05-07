package com.ibm.fundas.ui;
import com.ibm.fundas.model.Employee11;
import com.ibm.fundas.model.ContractEmployee;
public class Demo {
public static void main(String[] args) 
{
	Employee11 emp = new Employee11(101,"Shreya",5600);
	System.out.println(emp);
	ContractEmployee ce= new ContractEmployee(102,"Muskan",33000,12);
	//ContractEmployee ce2= new ContractEmployee();//irrespective of whatever cons in subclass by default it will always call constructors of super class i.e default
	System.out.println(ce);
}
}
