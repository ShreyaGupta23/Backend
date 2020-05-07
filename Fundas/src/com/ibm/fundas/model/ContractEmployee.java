package com.ibm.fundas.model;

public class ContractEmployee extends Employee11 {
  private int contractDuration;
  public ContractEmployee()
  {
	  System.out.println("Contract Employee created!");
	  
  }
public ContractEmployee(int eid, String eName, double basic,int contractDuration) {
	// this -> cant use because it will cause triggering of all at once
	super(eid, eName, basic);
	this.contractDuration=contractDuration;
}
@Override
public String toString()
{  return super.toString() + "\tDuration:" + this.contractDuration;
	}
public int getContractDuration() {
	return contractDuration;
}
public void setContractDuration(int contractDuration) {
	this.contractDuration = contractDuration;
}

}
