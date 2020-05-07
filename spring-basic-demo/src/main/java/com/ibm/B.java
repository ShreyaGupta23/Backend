package com.ibm;

public class B {
	public B() {}
	public B(C c) { //loose coupling
		this.c=c;
	}
	C c;
	public void execute() {
		c.execute();
		System.out.println("Execute method B");	
	}

}
