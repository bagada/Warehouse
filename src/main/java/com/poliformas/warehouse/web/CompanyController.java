package com.poliformas.warehouse.web;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.poliformas.warehouse.integration.entity.Company;
import com.poliformas.warehouse.service.CompanyService;
import com.poliformas.warehouse.web.forms.CompanyForm;

public class CompanyController {
	@Autowired
	private CompanyService companyService;

	@RequestMapping(value = "/registerCompany.htm", method = RequestMethod.GET)
	public String registerMark(ModelMap model) {
		System.out.println("------------------------algo mas--");
		 model.addAttribute("CompanyForm",new CompanyForm());

		return "companyMark";
	}
	
	@RequestMapping(value="/registerCompany.htm", method=RequestMethod.POST)
	public String registerNewUser(@Valid CompanyForm companyForm,  BindingResult result,
			Model model, HttpSession session){
		if (result.hasErrors()) {
			
			System.out.println("------------error--------------");
            return "/registerCompany.htm";
		}else{
			try {	
				
				Company company = new Company();
				
				company.setName(companyForm.getName());
				companyService.saveCompany(company);
				
				
				return "/prueba";
			} catch (Exception e) {
				model.addAttribute("error", "userAlreadyExist");
				return "/companyMark.htm";
			}
		}
			
	}

}
