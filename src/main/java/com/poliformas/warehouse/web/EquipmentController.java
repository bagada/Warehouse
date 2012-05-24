package com.poliformas.warehouse.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.poliformas.warehouse.integration.entity.Mark;
import com.poliformas.warehouse.service.EquipmetService;
import com.poliformas.warehouse.service.MarkService;

@Controller
public class EquipmentController {
	
	@Autowired 
	private EquipmetService equipmentService;
	@Autowired
	private MarkService markService;
	
	@RequestMapping(value = "/equipment.htm", method = RequestMethod.GET)
	public String login(ModelMap model) {
		List listMarks = markService.getAll();
		model.addAttribute("listita",listMarks);
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
