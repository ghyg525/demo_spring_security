package org.yangjie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	
	@RequestMapping("/")
	public String index(Model model){
		model.addAttribute("msg", "welcome");
		return "index.jsp";
	}
	
	@RequestMapping("/login")
	public String login(Model model){
		return "login.jsp";
	}
	
}
