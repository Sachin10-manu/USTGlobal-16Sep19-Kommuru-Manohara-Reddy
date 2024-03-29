package com.ustglobal.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestB {
	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("Vijay");
		hs.add("Ajay");
		hs.add("sujay");
		hs.add("sachin");
		hs.add("enjoy");
		
		System.out.println("***************Using for each***************");
		for(String s : hs) {
			System.out.println(s);
		}
		System.out.println("**************Using iterator*****************");
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			String p = it.next();
			System.out.println(p);
		}
	}
}
