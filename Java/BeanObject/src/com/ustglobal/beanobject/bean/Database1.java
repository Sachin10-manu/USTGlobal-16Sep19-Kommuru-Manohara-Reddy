package com.ustglobal.beanobject.bean;

public class Database1 {
	
	void receive(Employee e) {
		System.out.println("Id is "+e.getId());
		System.out.println("Salary is "+e.getSalary());
		System.out.println("name is "+e.getName());
		System.out.println("dept is "+e.getDept());
		System.out.println("Designation is "+e.getDesignation());
	}

}
