package com.ibm.fundas.model;

public class Manager extends Employee11 {

	private double ta;

	public Manager() {
		System.out.println("Manager created!");

	}

	public Manager(int eid, String eName, double basic, int ta) {
		// this -> cant use because it will cause triggering of all at once
		super(eid, eName, basic);
		this.ta = ta;
	}

	@Override
	public String toString() {
		return super.toString() + "TA:" + this.ta;
	}

	public double getTa() {
		return ta;
	}

	public void setTa(double ta) {
		this.ta = ta;
	}

}
