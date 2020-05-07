package com.ibm.fundas.model;
public class Diector extends Manager {

	 private double da;
	  public Diector()
	  {
		  System.out.println("Director created!");
		  
	  }
	public Diector(int eid, String eName, double basic,int ta,int da) {
		// this -> cant use because it will cause triggering of all at once
		super(eid, eName, basic,ta);
		this.da=da;
	}
	@Override
	public String toString()
	{  return super.toString() + "DA:" + this.da;
		}
	public double getDa() {
		return da;
	}
	public void setDa(double da) {
		this.da = da;
	}

}
