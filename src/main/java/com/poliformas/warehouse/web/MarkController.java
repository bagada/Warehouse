package com.poliformas.warehouse.web;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.poliformas.warehouse.integration.entity.Mark;
import com.poliformas.warehouse.service.MarkService;
import com.poliformas.warehouse.web.forms.MarkForm;

@Controller
public class MarkController {
	@Autowired
	private MarkService markService;

	@RequestMapping(value = "/registerMark.htm", method = RequestMethod.GET)
	public String registerMark(ModelMap model) {
		System.out.println("------------------------algo mas--");
		 model.addAttribute("markForm",new MarkForm());

		return "registerMark";
	}
	
	@RequestMapping(value="/registerMark.htm", method=RequestMethod.POST)
	public String registerNewUser(@Valid MarkForm markrForm,  BindingResult result,
			Model model, HttpSession session){
		if (result.hasErrors()) {
			
			System.out.println("------------error--------------");
            return "/registerMark";
		}else{
			try {	
				
				Mark mark = new Mark();
				
				mark.setName(markrForm.getName());
				markService.saveMark(mark);
				
				return "/prueba";
			} catch (Exception e) {
				model.addAttribute("error", "userAlreadyExist");
				return "/registerMark";
			}
		}
			
	}

}
