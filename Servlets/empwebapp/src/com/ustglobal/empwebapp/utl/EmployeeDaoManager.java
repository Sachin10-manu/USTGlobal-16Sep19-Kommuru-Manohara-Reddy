package com.ustglobal.empwebapp.utl;

import com.ustglobal.empwebapp.dao.EmployeeDao;
import com.ustglobal.empwebapp.dao.EmployeeDaoJdbcImpl;

public class EmployeeDaoManager {
	
	private EmployeeDaoManager(){
		
		}
	public static EmployeeDao getEmployeeDao() {
		return new EmployeeDaoJdbcImpl();
	}
}
