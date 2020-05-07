package com.ibm.fundas.ui;
import com.ibm.fundas.model.Employee11;
public class Whatever {
	public static void main(String[] args) {
		//final 
		Employee11 EMP= new Employee11(11,"aa",20.0);
		EMP=new Employee11(12,"bb",23);
		System.out.println(EMP);
		 final int AA=3;
		// AA=4;
		System.out.println(AA);
	}

}
