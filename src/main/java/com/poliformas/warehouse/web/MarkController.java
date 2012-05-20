package com.poliformas.warehouse.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.poliformas.warehouse.service.MarkService;
@Controller
public class MarkController {
@Autowired
MarkService markService;

@RequestMapping(value = "/registerMark", method = RequestMethod.GET)
public String registerMark(ModelMap model) {
	System.out.println("------------------------algo mas--");
//	model.addAttribute("markForm",new MarkForm());

	return "/registerUser";
}



}
