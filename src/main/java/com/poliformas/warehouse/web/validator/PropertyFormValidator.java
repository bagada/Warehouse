package com.poliformas.warehouse.web.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.poliformas.warehouse.web.forms.RegisterPropertyForm;

public class PropertyFormValidator implements Validator{
public boolean supports(Class<?> clazz){
	
return RegisterPropertyForm.class.equals(clazz);
}
public void validate(Object target, Errors errors){
	
//RegisterPropertyForm registerPropertyForm = (RegisterPropertyForm)target;
ValidationUtils.rejectIfEmptyOrWhitespace(errors, "ID_Equipment", "mandatoryField");
ValidationUtils.rejectIfEmptyOrWhitespace(errors, "Code", "mandatoryField");
ValidationUtils.rejectIfEmptyOrWhitespace(errors, "Date_Buy", "mandatoryField");
ValidationUtils.rejectIfEmptyOrWhitespace(errors, "Date_Warranty", "mandatoryField");
ValidationUtils.rejectIfEmptyOrWhitespace(errors, "Serie", "mandatoryField");

if(errors.hasErrors())return;

}

}