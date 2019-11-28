package com.ustglobal.maps;

import java.util.HashMap;

public class TestA {
	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		hm.put("kuku", 998014);
		hm.put("bala", 678941);
		hm.put("sheela", 789194);
		hm.put(null, 456789);
		
		System.out.println("Data "+hm);
		hm.put("bala", 789987);
		System.out.println("After modify "+hm);
		hm.put("dimple", 789987);
		System.out.println("After dimple "+hm);
		System.out.println("After null "+hm);
		
		Object name = hm.get("sheela");
		System.out.println("Value "+name);
		System.out.println(hm.get("manu"));
		
		System.out.println(hm.remove("kuku"));
		System.out.println(hm);
	}
}
