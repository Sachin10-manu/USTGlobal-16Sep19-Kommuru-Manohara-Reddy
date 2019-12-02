package com.ustglobal.retailermaintenanceproject.dao;

import com.ustglobal.retailermaintenanceproject.dto.ProductBean;
import com.ustglobal.retailermaintenanceproject.dto.RetailerBean;

public interface RetailerDao {

	public int createProfile(RetailerBean bean);
	public RetailerBean login(int rId,String password);
	public RetailerBean search(int rId);
	public boolean changePassword(int rId,String password);
	public int amountPay(int rId);
	public ProductBean orders(int rId);
}
