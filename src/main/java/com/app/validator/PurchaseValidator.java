package com.app.validator;

import java.util.regex.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.app.model.Purchase;
@Component
public class PurchaseValidator implements Validator {

	public boolean supports(Class<?> clazz) {
		
		return Purchase.class.equals(clazz);
	}

	public void validate(Object target, Errors errors) {
		Purchase p=(Purchase) target;
		if(!Pattern.matches("[A-Za-z]{5,9}",p.getoCode()))
				{
			errors.rejectValue("oCode","null", "Please Enter Valid Code");
				}
		if(!Pattern.matches("[A-Z0-9]{5}", p.getShMode()));
		{
			errors.rejectValue("shMode", null, "Enter valid Mode");
		}
	}

}
