package com.udemy.backendninja.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.udemy.backendninja.model.Person;

@Controller
@RequestMapping("/example3")
public class Example3Controller {
	
	private static final Log LOGGER = LogFactory.getLog(Example3Controller.class);
	
	
	
	public static final String view3 = "example3";
	public static final String result_view = "result";
	
	//n1
	/*
	@GetMapping("/")
	public String redirect() {
		return "redirect:/example3/showform";
	}*/
	
	//n2
	@GetMapping("")
	public RedirectView redirectView() {
		return new RedirectView("/example3/showform");
	}
	
	@GetMapping("/showform")
	public String showform(Model model) {
		LOGGER.info("info trace");
		LOGGER.warn("warning trace");
		LOGGER.error("error trace");
		LOGGER.debug("debug trace");
		model.addAttribute("person", new Person());
		return view3;
	}
	
	@PostMapping("/addperson")
	public ModelAndView addperson(@ModelAttribute("person") Person person) {
		LOGGER.info("METHOD: 'addperson' -- PARAMS:'"+person+"'");
		ModelAndView mav = new ModelAndView(result_view);
		mav.addObject("person",person);
		LOGGER.info("TEMPLATE: "+result_view+" -- DATA:'"+person+"'");
		return mav;
	}
}
