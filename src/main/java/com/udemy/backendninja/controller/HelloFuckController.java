package com.udemy.backendninja.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.udemy.backendninja.component.ExampleComponent;

import com.udemy.backendninja.services.ExampleService;

@Controller
@RequestMapping("/hello")
public class HelloFuckController {
	
	@Autowired // indica uso de un componente en la memoria de spring
	@Qualifier("ExampleComponent") // llama al componenente
	private ExampleComponent examplecomponent;
	
	@Autowired
	@Qualifier("exampleservice")
	private ExampleService exampleservice;
	
	
	@GetMapping("/world")
	public String helloFuck(Model model) {
		model.addAttribute("people",exampleservice.getListPeople());
		return "helloworld";
	}
	
	@GetMapping("/worldv")
	public ModelAndView modelandview() {
		examplecomponent.SayHello();
		ModelAndView mav = new	ModelAndView("helloworld");
		mav.addObject("people",exampleservice.getListPeople());
		return mav;
	}

	/*private List<Person> getPeople(){
		List<Person> people = new ArrayList<>();
		people.add(new Person("jon snow","40"));
		people.add(new Person("ned stark","50"));
		people.add(new Person("jajaja","60"));
		return people;
	}*/

}
