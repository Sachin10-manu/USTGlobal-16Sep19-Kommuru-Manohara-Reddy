package com.ustglobal.maps;

import java.util.Map;
import java.util.TreeMap;

public class TestE {
	public static void main(String[] args) {
		
		TreeMap<String, Integer> lh = new TreeMap<String, Integer>();
		lh.put("Haryana", 560068);
		lh.put("Bangalore", 134203);
		lh.put("Patna", 880000);
//		lh.put(null, 78789); NullPointerException
		
		for(Map.Entry<String, Integer> m : lh.entrySet()) {
			String key = m.getKey();
			Integer value = m.getValue();
			System.out.println("Key is "+key);
			System.out.println("Value is "+value);
			System.out.println("<><><><><><><><><><><><><><>");
		}
	}
}
