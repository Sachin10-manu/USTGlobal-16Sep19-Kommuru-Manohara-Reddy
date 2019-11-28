package com.ustglobal.mobileapp.util;

import com.ustglobal.mobileapp.dao.MobileApp;
import com.ustglobal.mobileapp.dao.MobileDao;

public class MobileFactory {
	
	private MobileFactory() {
		
	}
	
	public static MobileDao getMobileDao() {
		return new MobileApp();
	}
}
