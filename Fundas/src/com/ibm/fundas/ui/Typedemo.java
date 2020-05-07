package com.ibm.fundas.ui;

import com.ibm.fundas.model.*;

public class Typedemo {
	public static void main(String[] args) {
		Employee11 e1 = new Manager(11, "a", 22, 32);// implicit
		Employee11 e2 = new ContractEmployee(11, "a", 22, 32);
		System.out.println(e1);
		System.out.println(e2);// Dynamic Polymorphism or late binding
		Manager m1 = (Manager) e1;// explicit ,if instead of e1 you write e2 not error but runtime exception
									// -class cast exception
		System.out.println(m1);
		Employee11[] emps = { new Employee11(1, "a", 12), new Manager(1, "a", 12, 12), new Diector(1, "a", 12, 33, 44),
				new ContractEmployee(1, "a", 12, 22) };
		for (Employee11 e : emps) {
			e.setBasic(e.getBasic() + (e.getBasic() * 0.1));
			// e.setTa(e.getTa()+(e.getTa()*0.1));error not directly the method
			// Manager m=(Manager)e;
			// m.setTa(m.getTa()+(m.getTa()*0.1));error because of iteration
			
			if(e instanceof Diector) {
				Diector d=(Diector)e;
				d.setTa(d.getTa() + (d.getTa() * 0.1));
				d.setDa(d.getDa() + (d.getDa() * 0.1));
			}
			else if (e instanceof Manager) {
				Manager m = (Manager) e;
				m.setTa(m.getTa() + (m.getTa() * 0.1));
			}
			//use nested if
		}
	}
}