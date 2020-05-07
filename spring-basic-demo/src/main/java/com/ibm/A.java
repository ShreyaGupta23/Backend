package com.ibm;

public class A {
	public A() {}
	public A(B b) { //loose coupling
		this.b=b;
	}
	B b;//hard coupling ,only use B
public void execute()
{   b.execute();
  System.out.println("Execute method A");

	}
}
