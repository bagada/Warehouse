package com.poliformas.warehouse.web.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.poliformas.warehouse.web.forms.CompanyForm;

public class CompanyFormValidator implements Validator{
        
        public boolean supports(Class<?> clazz){
                
                return CompanyForm.class.equals(clazz);
                }
                public void validate(Object target, Errors errors){
                        
                //RegisterPropertyForm registerPropertyForm = (RegisterPropertyForm)target;
                ValidationUtils.rejectIfEmptyOrWhitespace(errors, "Name", "mandatoryField");


                if(errors.hasErrors())return;

                }
        

}