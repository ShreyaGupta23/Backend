package com.ibm.fundas.model;

public abstract class Staff {
	private String fname;
	private String lname;
	private double basic;
public Staff(String fname, String lname, double basic) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.basic = basic;
	}

public String getFname() {
	return fname;
}

public void setFname(String fname) {
	this.fname = fname;
}

public String getLname() {
	return lname;
}

public void setLname(String lname) {
	this.lname = lname;
}

public double getBasic() {
	return basic;
}

public void setBasic(double basic) {
	this.basic = basic;
}

public abstract double getTA();
public abstract double getHRA();
public abstract double getIncentive();
public  double getNetPay()
{return basic + getTA() + getHRA() + getIncentive();}

@Override
public String toString() {
	return "Staff [fname=" + fname + ", lname=" + lname + ", basic=" + basic + ", TA=" + getTA() + ",HRA="
			+ getHRA() + ",Incentive=" + getIncentive() + ", NetPay=" + getNetPay() + "]";
}

}
