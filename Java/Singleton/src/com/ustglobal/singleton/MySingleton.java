package com.ustglobal.singleton;

public class MySingleton {
	
	String s;

	private static MySingleton instance = null;

	private MySingleton() {

	}

	public static MySingleton getDbConnection() {
		if(instance == null) {

			instance = new MySingleton();
		}
		return instance;
	}

}
