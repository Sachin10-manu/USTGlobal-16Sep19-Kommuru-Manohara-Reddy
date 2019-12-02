package com.ustglobal.retailermaintenanceproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.retailermaintenanceproject.dao.RetailerDao;
import com.ustglobal.retailermaintenanceproject.dto.ProductBean;
import com.ustglobal.retailermaintenanceproject.dto.RetailerBean;

@Service
public class RetailerServiceImpl implements RetailerService {

	@Autowired
	private RetailerDao dao;	

	@Override
	public int createProfile(RetailerBean bean) {

		return dao.createProfile(bean);
	}

	@Override
	public RetailerBean login(int rId, String password) {

		return dao.login(rId, password);
	}

	@Override
	public RetailerBean search(int rId) {

		return dao.search(rId);
	}

	@Override
	public boolean changePassword(int rId, String password) {

		return dao.changePassword(rId, password);
	}

	@Override
	public int amountPay(int rId) {

		return dao.amountPay(rId);
	}
	

	@Override
	public ProductBean orders(int rId) {
		
		return dao.orders(rId);
	}

	

}
