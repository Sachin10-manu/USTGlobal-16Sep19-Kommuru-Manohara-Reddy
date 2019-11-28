package com.ustglobal.collection.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestE {
	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet();
		
		ts.add(34);
		ts.add(45);
		ts.add(99);
		ts.add(9);
		ts.add(30);
		
		System.out.println("******************Using for each*************");
		
		for(Object o : ts) {
			System.out.println(o);
		}
		
		System.out.println("*************Using iterator*****************");
		
		Iterator it = ts.iterator();
		while(it.hasNext()) {
			Object p = it.next();
			System.out.println(p);
		}
		
	}
}
