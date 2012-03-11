package com.poliformas.warehouse.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(value="/secure/home", method=RequestMethod.GET)
	public String home(Model model){
	
		return "welcome";
	}
	
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String welcomeAdmin(Model model){
		return "welcomeAdmin";
	}
	
	
	
	
	

}
