package com.poliformas.warehouse.web.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.poliformas.warehouse.web.forms.MarkForm;

public class MarkFormValidator implements Validator{
	
	public boolean supports(Class<?> clazz){
		
		return MarkForm.class.equals(clazz);
		}
		public void validate(Object target, Errors errors){
			
		//RegisterPropertyForm registerPropertyForm = (RegisterPropertyForm)target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "Name", "mandatoryField");


		if(errors.hasErrors())return;

		}
	

}
