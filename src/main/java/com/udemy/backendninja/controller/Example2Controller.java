package com.udemy.backendninja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("example2")
public class Example2Controller {
	
	private static final String view2 = "example2";
	
	@GetMapping("/request1")
	public ModelAndView request1(@RequestParam(name = "nm",required = false, defaultValue = "Toromax") String name) {
		ModelAndView mav = new ModelAndView(view2);
		mav.addObject("nm_in_model",name);
		return mav;
	}
	
}
