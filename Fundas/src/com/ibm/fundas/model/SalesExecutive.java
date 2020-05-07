package com.ibm.fundas.model;

public class SalesExecutive extends Staff {

	public SalesExecutive(String fname, String lname, double basic) {
		super(fname, lname, basic);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getTA() {
		// TODO Auto-generated method stub
		return getBasic()*0.15;
	}

	@Override
	public double getHRA() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getIncentive() {
		// TODO Auto-generated method stub
		return getBasic()*0.50;
	}

}
