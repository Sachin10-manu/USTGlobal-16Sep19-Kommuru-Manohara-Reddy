package com.ustglobal.collection.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestJ {
	public static void main(String[] args) {
		
		SortById si = new SortById();
		SortByName1 sn = new SortByName1();
		TreeSet<Customer> ts = new TreeSet<Customer>(sn);
		
		Customer c1 = new Customer("Manu", 1, 100000);
		Customer c2 = new Customer("Siri", 2, 50000);
		Customer c3 = new Customer("Sai", 3, 80000);
		Customer c4 = new Customer("Pavan", 4, 70000);
		
		ts.add(c1);
		ts.add(c2);
		ts.add(c3);
		ts.add(c4);
		
		Iterator<Customer> it = ts.iterator();
		while(it.hasNext()) {
			Customer c = it.next();
			System.out.println("Name is "+c.name);
			System.out.println("Id is "+c.id);
			System.out.println("Salary is "+c.salary);
			System.out.println(">>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<");
		}
	}
}
