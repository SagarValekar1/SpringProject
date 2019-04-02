package com.app.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IPurchaseDao;
import com.app.model.Purchase;
@Repository
public class PurchaseDaoImpl implements IPurchaseDao {
@Autowired
private HibernateTemplate ht;

public Integer savePurchase(Purchase p) {
	
	return (Integer)ht.save(p);
}

}
