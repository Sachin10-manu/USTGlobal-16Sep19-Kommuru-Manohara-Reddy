package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestE {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add("Mam");
		
		Object o = al.get(0);
		String name = (String) o;
		name = name.toUpperCase();
		System.out.println(name);
	}
}
