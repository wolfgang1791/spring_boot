package com.udemy.backendninja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/example")
public class ExampleController {
	
	private static final String view = "example";
	
	// primera forma
	//@GetMapping( "/example/primera")// funcion resumida
	@RequestMapping(value = "/primera", method = RequestMethod.GET)
	public String exampleString() {
		System.out.print(view);
		return view;
	}
	
	// segunda forma
	
	@RequestMapping(value = "/primeraMaV", method = RequestMethod.GET)
	public ModelAndView exampleMaV() {
		return new ModelAndView(view);
	}

}
