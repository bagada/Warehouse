package com.poliformas.warehouse.web.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.poliformas.warehouse.web.forms.RegisterEmployeeForm;

	public class EmployeeFormValidator implements Validator{
	
	public boolean supports(Class<?> clazz){
		return RegisterEmployeeForm.class.equals(clazz);
}
	public void validate(Object target, Errors errors){
//RegisterEmployeeForm registerEmployeeForm = (RegisterEmployeeForm)target;
ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "mandatoryField");
if(errors.hasErrors())return;
}


}