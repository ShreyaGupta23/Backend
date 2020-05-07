package com.ibm.fundas.model;

public class ComplexNumber {
private int real; //hold the real part
private int img;  //hold the imaginary part
public ComplexNumber() {
	System.out.println("Object created");
}
public ComplexNumber(int real, int img) {
	this();
	this.real = real;
	this.img = img;
}
public ComplexNumber(ComplexNumber z) {
	this(z.real,z.img); //invoking 1 constructor from another
	
}
public int getReal() {
	return real;
}
public void setReal(int real) {
	this.real = real;
}
public int getImg() {
	return img;
}
public void setImg(int img) {
	this.img = img;
}
public static ComplexNumber add(ComplexNumber zx,ComplexNumber zy) {
	return new ComplexNumber(zx.real+zy.real,zx.img+zy.img); //anonymous object-> dont have name but creating and returning
}
public static ComplexNumber multiply(ComplexNumber zx,ComplexNumber zy) {
	return new ComplexNumber((zx.real*zy.real)-(zx.img*zy.img),(zx.img*zy.real)+(zy.img*zx.real)); //anonymous object-> dont have name but creating and returning
}

}
