package com.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IPurchaseDao;
import com.app.model.Purchase;
import com.app.service.IPurchaseService;
@Service
public class PurchaseServiceImpl implements IPurchaseService {

	@Autowired 
	private IPurchaseDao dao;
	@Transactional
	public Integer savePurchase(Purchase p) {
		
		return dao.savePurchase(p);
	}
	
}
