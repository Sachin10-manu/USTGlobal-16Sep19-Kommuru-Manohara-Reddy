package com.ustglobal.mobileapp.dao;

import java.util.List;

import com.ustglobal.mobileapp.dto.Person;

public interface MobileDao {
	
	List<Person> showAllContact();
	
	boolean addcontact();
	
	boolean deletecontact();
	
	boolean editcontact();
}
