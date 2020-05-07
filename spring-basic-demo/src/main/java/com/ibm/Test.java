package com.ibm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	//B b=new B();
	//A a=new A(b);constructor
	//a.execute();
//	B b  = new B();
//	A a = new A();
//	a.setB(b);gettersetter
	
//	 Spring code that can generate objects and wire up dependencies
	ApplicationContext context = new ClassPathXmlApplicationContext("classpath:bean.xml");
	A a = context.getBean(A.class);
	a.execute();
	PaymentService ps = (PaymentService)context.getBean("paymentService");
	ps.payment();
}
}
