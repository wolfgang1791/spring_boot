package com.udemy.backendninja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.udemy.backendninja.model.Person;

@Controller
@RequestMapping("/example3")
public class Example3Controller {
	
	public static final String view3 = "example3";
	public static final String result_view = "result";
	
	@GetMapping("/showform")
	public String showform(Model model) {
		model.addAttribute("person", new Person());
		return view3;
	}
	
	@PostMapping("/addperson")
	public ModelAndView addperson(@ModelAttribute("person") Person person) {
		ModelAndView mav = new ModelAndView(result_view);
		mav.addObject("person",person);
		return mav;
	}
}
