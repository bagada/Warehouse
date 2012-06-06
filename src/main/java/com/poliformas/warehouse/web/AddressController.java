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

import com.poliformas.warehouse.integration.entity.Address;
import com.poliformas.warehouse.service.AddressService;
import com.poliformas.warehouse.web.forms.RegisterAddressForm;
import com.poliformas.warehouse.web.validator.AddressFormValidator;

@Controller
public class AddressController {
	
	@Autowired
	private AddressService addressService;
	
	@InitBinder
    protected void initBinder(WebDataBinder binder){
            binder.setValidator(new AddressFormValidator());
    }
	
	@RequestMapping(value = "/registerAddress", method = RequestMethod.GET)
	public String login(ModelMap model) {
		System.out.println("------------------------algo--");
		model.addAttribute("RegisterAddressForm",new RegisterAddressForm());

		return "/registerAddress";
	}
	
	@RequestMapping(value = "/registerAddress", method = RequestMethod.POST)
	public String create(@Valid RegisterAddressForm regiterEmployeeForm, BindingResult result,
			Model model, HttpSession session) {
		if (result.hasErrors()) {
			System.out.println("---------------------+++++++");

			return "/registerAddress";
		}else{
			try{
				Address address = new Address();
				
				address.setIdAddress(Integer.parseInt(RegisterAddressForm.));
				address.setState()
				
			}catch(Exception e){
				System.out.println("---------------------");
			model.addAttribute("error", "userAlreadyExist");
			return "registerAddress";
			}
		}
	}