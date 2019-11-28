package com.ustglobal.collection.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestI {
	public static void main(String[] args) {
		
		SortByName sb = new SortByName();
		SortByMicr sm = new SortByMicr();
		SortByPincode sp = new SortByPincode();
		TreeSet<Bank> ts = new TreeSet<Bank>(sp);
		Bank b1 = new Bank("HDFC", 560068, 67686968);
		Bank b2 = new Bank("SBI", 560067, 67686970);
		Bank b3 = new Bank("CITI", 560066, 67686977);
		Bank b4 = new Bank("CANARA", 560065, 67686980);
		
		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		ts.add(b4);
		
		System.out.println("***********Using iterator***********");
		Iterator<Bank> it = ts.iterator();
		while(it.hasNext()) {
			Bank b = it.next();
			System.out.println("Name is "+b.name);
			System.out.println("Pincode is "+b.pincode);
			System.out.println("MICR is "+b.micr);
			System.out.println(">>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<");
		}
	}
}
