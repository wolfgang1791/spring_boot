package com.udemy.backendninja.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloFuckController {
	
	@GetMapping("/world")
	public String helloFuck() {
		return "helloworld";
	}
}
