package com.ustglobal.collection.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestF {
	public static void main(String[] args) {
		
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("roopa");
		ts.add("jaya");
		ts.add("sushma");
		ts.add("munni");
		ts.add("sheela");
		
		for(String s : ts) {
			System.out.println(s);
		}
		
		Iterator<String> it = ts.iterator();
		while(it.hasNext()) {
			String m = it.next();
			System.out.println(m);
		}
	}
}
