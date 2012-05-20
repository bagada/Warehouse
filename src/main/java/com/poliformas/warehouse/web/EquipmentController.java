package com.poliformas.warehouse.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.poliformas.warehouse.integration.entity.Equipment;

@Controller
public class EquipmentController {
	
	@RequestMapping(value = "/equipment.htm", method = RequestMethod.GET)
	public String login(ModelMap model) {
	//	System.out.println("------------------------algo mas--");
	//	model.addAttribute("loginForm",new LoginForm());

		return "equipment";
	}
	//@RequestMapping(value="/equipment",method=RequestMethod.POST)
	//public @ResponseBody Equipment addUser(@RequestParam(value="id") Integer id){ 
//	Equipment equipment = EquipmentService.saveEquipment(id);
			
		//return equipment;
	
	//}
	


}
