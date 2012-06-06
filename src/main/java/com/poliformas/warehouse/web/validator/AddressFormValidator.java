package com.poliformas.warehouse.web.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.poliformas.warehouse.web.forms.RegisterAddressForm;

public class AddressFormValidator implements Validator{
	
	public boolean supports(Class<?> clazz){
		return RegisterAddressForm.class.equals(clazz);
}
	public void validate(Object target, Errors errors){
ValidationUtils.rejectIfEmptyOrWhitespace(errors, "idAddress", "mandatoryField");
ValidationUtils.rejectIfEmptyOrWhitespace(errors, "state", "mandatoryField");
ValidationUtils.rejectIfEmptyOrWhitespace(errors, "city", "mandatoryField");
ValidationUtils.rejectIfEmptyOrWhitespace(errors, "street", "mandatoryField");
ValidationUtils.rejectIfEmptyOrWhitespace(errors, "phoneNumber", "mandatoryField");
if(errors.hasErrors())return;
}


}
