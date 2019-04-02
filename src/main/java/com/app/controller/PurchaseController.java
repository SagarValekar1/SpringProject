package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.app.model.Purchase;
import com.app.service.IPurchaseService;
import com.app.validator.PurchaseValidator;

@Controller
public class PurchaseController {
	@Autowired	
	private IPurchaseService serv;
	@Autowired
	private PurchaseValidator validator; 
@RequestMapping("/Purchase1")
public ModelAndView addPurchase(Model model)
{
	System.out.println("addPurchase......");
	Purchase p= new Purchase();
	model.addAttribute("purchase",p);
	return new  ModelAndView ("PurchasePlaceOrder");
}
@RequestMapping("/AddPurchase")
public String addPurchase(@ModelAttribute("purchase")Purchase p,Errors error,ModelMap map)
{ 
	String page=null;
	validator.validate(p, error);
	if(error.hasErrors())
	{
		page="PurchasePlaceOrder";
	}
	else
	{
		int s=serv.savePurchase(p);
		System.out.println(s);
		page="success";
	}
	return page;
}
}
