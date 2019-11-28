package com.ustglobal.collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestD {
	public static void main(String[] args) {
		
		LinkedHashSet<Double> ls = new LinkedHashSet<Double>();
		
		ls.add(12.3);
		ls.add(21.6);
		ls.add(45.6);
		ls.add(10.2);
		ls.add(99.45);
		
		System.out.println("***************Using for each*************");
		
		for(double d : ls) {
			System.out.println(d);
		}
		
		System.out.println("***************Using Iterator***********");
		
		Iterator<Double> it = ls.iterator();
		while(it.hasNext()) {
			double d = it.next();
			System.out.println(d);
		}
	}
}
