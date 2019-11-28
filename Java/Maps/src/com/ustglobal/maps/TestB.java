package com.ustglobal.maps;

import java.util.HashMap;

public class TestB {
	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		hm.put("kuku", 998014);
		hm.put("bala", 678941);
		hm.put("sheela", 789194);
		
		HashMap hm1 = new HashMap();
		hm1.put("deepu", 789099);
		hm1.put("riya", 678989);
		hm1.put("kriti", 467787);
		
		boolean hasKey = hm.containsKey("bala");
		System.out.println(hasKey);
		
		boolean hasValue = hm.containsValue(789195);
		System.out.println(hasValue);
		
		hm.putAll(hm1);
		System.out.println("After put all "+hm);
		
		System.out.println(hm.size());
		
		System.out.println(hm.isEmpty());
		
		hm.clear();
		System.out.println("After clear "+hm);
	}
}
