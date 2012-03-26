package com.poliformas.warehouse.web;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.poliformas.warehouse.integration.entity.Property;
import com.poliformas.warehouse.service.PropertyService;
import com.poliformas.warehouse.service.impl.PropertyServiceImpl;
import com.poliformas.warehouse.web.forms.RegisterPropertyForm;
import com.poliformas.warehouse.web.validator.PropertyFormValidator;

@Controller
public class PorpertyController {
	
	
	private PropertyServiceImpl propertyService = new PropertyServiceImpl(); 
	
	@InitBinder
    protected void initBinder(WebDataBinder binder){
            binder.setValidator(new PropertyFormValidator());
    }
	@RequestMapping
	(value = "/registerProperty", method = RequestMethod.GET)
	public String login(ModelMap model) {
		System.out.println("------------------------algo--");
		model.addAttribute("registerPropertyForm",new RegisterPropertyForm());
		return "/registerProperty";
}
	@RequestMapping(value = "/registerProperty", method = RequestMethod.POST)
	public String create(@Valid RegisterPropertyForm registerPropertyForm, BindingResult result,Model model, HttpSession session) {
		if (result.hasErrors()) {
			System.out.println("---------------------+++++++");

			return "/registerProperty";
		}
		else{
			try{	
				Property property = new Property();
				property.setSerie(Integer.parseInt(registerPropertyForm.getSerie()));
				property.setCode(registerPropertyForm.getCode());
				property.setIdequipment(Integer.parseInt(registerPropertyForm.getID_Equipment()));
				//property.setDatebuy(registerPropertyForm.getDate_Buy());
				//property.setDatewarranty(registerPropertyForm.getDate_Warranty());
				propertyService.saveProperty(property);
				return "/login";
			}
			catch(Exception e){
				model.addAttribute("error","userAlreadyExist");
				return "/registerProperty";
		
			}
		}
}
}