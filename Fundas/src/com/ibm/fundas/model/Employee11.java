package com.ibm.fundas.model;

public class Employee11 {
	private int eid;
	private String eName;
	private double basic;
	public Employee11()
	{
		System.out.println("Emp created");
	}
	public Employee11(int eid, String eName, double basic) {
		this();
		this.eid = eid;
		this.eName = eName;
		this.basic = basic;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", eName=" + eName + ", basic=" + basic + "]";
	}

}
