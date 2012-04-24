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

import com.poliformas.warehouse.integration.entity.Employee;
import com.poliformas.warehouse.service.EmployeeService;
import com.poliformas.warehouse.web.forms.RegisterEmployeeForm;
import com.poliformas.warehouse.web.validator.EmployeeFormValidator;

@Controller
public class EmployeeCotroller {
	
	@Autowired
	private EmployeeService employeeService;
	@InitBinder
    protected void initBinder(WebDataBinder binder){
            binder.setValidator(new EmployeeFormValidator());
    }
	
	@RequestMapping(value = "/registerEmployee", method = RequestMethod.GET)
	public String login(ModelMap model) {
		System.out.println("------------------------algo--");
		model.addAttribute("RegisterEmployeeForm",new RegisterEmployeeForm());

		return "/registerEmployee";
	}
	
	@RequestMapping(value = "/registerEmployee", method = RequestMethod.POST)
	public String create(@Valid RegisterEmployeeForm regiterEmployeeForm, BindingResult result,
			Model model, HttpSession session) {
		if (result.hasErrors()) {
			System.out.println("---------------------+++++++");

			return "/registerEmployee";
		}else{
			try{
				Employee employee= new Employee();
				
				employee.setName(regiterEmployeeForm.getName());
				
				employeeService.saveEmployee(employee);
				return "/login";
				
			}catch(Exception e){
			model.addAttribute("error", "userAlreadyExist");
			return "registerEmployee";
			}
		}
	}
	

}
