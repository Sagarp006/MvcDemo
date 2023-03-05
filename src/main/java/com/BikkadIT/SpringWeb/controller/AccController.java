package com.BikkadIT.SpringWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.BikkadIT.SpringWeb.model.Account;

@Controller
public class AccController {

	@GetMapping("/regForm")   //getting data from front end
	public String loadForm() {
		return "accReg";
		
	}	
	@GetMapping("/saveDetails")   //loading data from front end to database
	public String saveUser(Account acc,Model model) {
		model.addAttribute("ACC",acc);
		String s="You have Successfully Created the Account";
		model.addAttribute("REG",s);
		return "accCreated";
		
	}
}
