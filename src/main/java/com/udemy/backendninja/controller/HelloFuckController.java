package com.udemy.backendninja.controller;

import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello")
public class HelloFuckController {
	
	@GetMapping("/world")
	public String helloFuck(Model model) {
		model.addAttribute("name","Clemente");
		return "helloworld";
	}
	
	@GetMapping("/worldv")
	public ModelAndView modelandview() {
		ModelAndView mav = new	ModelAndView("helloworld");
		mav.addObject("name","Celestino");
		return mav;
	}
}
