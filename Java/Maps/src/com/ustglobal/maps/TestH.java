package com.ustglobal.maps;

import java.util.Hashtable;

public class TestH {
	public static void main(String[] args) {
		
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(101, "ajay");
		ht.put(102, "manu");
		ht.put(501, "sonu");
		ht.put(104, "monu");
		ht.put(101, "sriram");
		ht.put(500, "xyz");
		ht.put(-1, "abc");
//		ht.put(null, "john"); NullPointerException
//		ht.put(108, null); NullPointerException
		
		System.out.println("Data "+ht);
		
	}
}
