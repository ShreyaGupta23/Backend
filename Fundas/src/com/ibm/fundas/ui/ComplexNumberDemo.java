package com.ibm.fundas.ui;
import com.ibm.fundas.model.*;
public class ComplexNumberDemo {
	public static void main(String[] args)
	{  //4 references but 3 objects
		ComplexNumber z1;  //Declaration
		z1=new ComplexNumber(); //Instantiation
		z1.setReal(12);
		z1.setImg(-9);
		ComplexNumber z2=z1; //2 diff name for same object ,z2 is not copy of z1 rather another reference to the same object(call by reference)
		z2.setImg(51);
		ComplexNumber z3= new ComplexNumber(1,-12); //z3 and z4 have different reference
		ComplexNumber z4= new ComplexNumber(z3);
		z4.setReal(22);
		ComplexNumber z5=ComplexNumber.add(z1,z3);
		ComplexNumber z6=ComplexNumber.multiply(z1,z3);
		System.out.println(z1.getReal()+","+z1.getImg());
		System.out.println(z3.getReal()+","+z3.getImg());
		System.out.println(z4.getReal()+","+z4.getImg());
		System.out.println(z5.getReal()+","+z5.getImg());
		System.out.println(z6.getReal()+","+z6.getImg());
	}
	

}
