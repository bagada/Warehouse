package com.poliformas.warehouse.web;

import java.util.Date;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.poliformas.warehouse.integration.entity.Authority;
import com.poliformas.warehouse.integration.entity.User;
import com.poliformas.warehouse.integration.entity.UserPassword;
import com.poliformas.warehouse.service.AuthorityService;
import com.poliformas.warehouse.service.UserPasswordService;
import com.poliformas.warehouse.service.UserService;
import com.poliformas.warehouse.web.forms.UserForm;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	@Autowired
	UserPasswordService userPasswordService;
	@Autowired
	AuthorityService AuthorityService;

	@RequestMapping(value = "/registerUser", method = RequestMethod.GET)
	public String registerUser(ModelMap model) {
		System.out.println("------------------------algo mas--");
		model.addAttribute("userForm",new UserForm());

		return "/registerUser";
	}

	@RequestMapping(value="/registerUser", method=RequestMethod.POST)
	public String registerNewUser(@Valid UserForm userForm,  BindingResult result,
			Model model, HttpSession session){
		if (result.hasErrors()) {
			model.addAttribute("fechaHoy", new Date());
			System.out.println("------------error--------------");
            return "/registerUser";
		}else{
			System.out.println("--------------------------");
			try {
				System.out.println("--------------------------");
			User user = new User();
		
			user.setUsername(userForm.getname());
			System.out.println(user.getUsername());
			user.setEmail("ffff");
			user.setEnabled(true);
			System.out.println("--------------------------");
			try{
					userService.saveUser(user);
			
			}catch(Exception e){
				e.printStackTrace();
			}
			System.out.println("--------------------------");
			
			UserPassword userPassword = new UserPassword();
			userPassword.setIdUser(String.valueOf(user.getIdUser()));
			userPassword.setPassword(userForm.getPassword());
			userPasswordService.saveUserPassword(userPassword);
			
			Authority authority = new Authority();
			authority.setIdUser(user.getIdUser());
			authority.setAuthority(userForm.getRole());
			AuthorityService.saveAuthority(authority);
				return "/login";
			} catch (Exception e) {
				model.addAttribute("error", "userAlreadyExist");
				return "/registerUser";
			}
		}
		
		
	
		
	}
	
}
