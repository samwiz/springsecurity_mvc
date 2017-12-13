package com.sportsstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@RequestMapping(value = { "/homePage"}, method = RequestMethod.GET)
	public String homePage(Model model) {
		
		return "homePage";
	}
	@RequestMapping(value="/loginPage", method=RequestMethod.GET)
	public String login(@RequestParam(value ="error", required=false) String error, @RequestParam(value ="logout", required=false) String logout, Model model) {
		
		if(error !=null){
			model.addAttribute("error", "Invalid Credentials");
		}else if(logout !=null){
			model.addAttribute("error", "logged out of Sports Store");
		}
		return "loginPage";
	}

}
