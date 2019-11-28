package com.ustglobal.beanobject.bean;

public class TestB {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setId(1);
		e.setName("Bull Reddy");
		e.setDept(10);
		e.setSalary(10000);
		e.setDesignation("Developer");
		
		Database1 db = new Database1();
		db.receive(e); 
	}

}
