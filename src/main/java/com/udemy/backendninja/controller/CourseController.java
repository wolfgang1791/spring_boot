package com.udemy.backendninja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.udemy.backendninja.entity.Course;
import com.udemy.backendninja.services.CourseService;


@Controller()
@RequestMapping("/course")
public class CourseController {
	
	private static final String COURSE_VIEW = "courses";
	
	@Autowired
	@Qualifier("courseServiceImplementation")
	private CourseService courseservice;
	
	@RequestMapping("/list")
	public ModelAndView listAllCourse() {
		ModelAndView mav = new ModelAndView(COURSE_VIEW);
		mav.addObject("courses",courseservice.ListAllCourse());
		return mav;
	}
	
	@PostMapping("/addCourse")
	public String addCourse(@ModelAttribute("course") Course course) {
		courseservice.ListAllCourse();
		return "redirect:/list";
	}

}
