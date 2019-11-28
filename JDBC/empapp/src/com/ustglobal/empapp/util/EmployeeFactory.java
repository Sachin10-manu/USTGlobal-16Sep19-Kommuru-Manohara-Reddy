package com.ustglobal.empapp.util;

import com.ustglobal.emp.dao.EmployeeDAO;
import com.ustglobal.emp.dao.EmployeeDAOImpl;

public class EmployeeFactory {
	
	private EmployeeFactory() {
		
	}
	
	public static EmployeeDAO getEmployeeDAO() {
		return new EmployeeDAOImpl();		
	}
}
