package com.udemy.backendninja.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.udemy.backendninja.converter.CourseConverter;
import com.udemy.backendninja.entity.Course;
import com.udemy.backendninja.model.CourseModel;
import com.udemy.backendninja.services.CourseService;


@Controller()
@RequestMapping("/course")
public class CourseController {
	
	private static final Log LOGGER = LogFactory.getLog(CourseController.class);
	private static final String COURSE_VIEW = "courses";
	
	@Autowired
	@Qualifier("courseServiceImplementation")
	private CourseService courseservice;
	
	
	@Autowired
	@Qualifier("courseConverter")
	private CourseConverter courseconverter;
	
	
	@RequestMapping("/list")
	public ModelAndView listAllCourse() {
		
		LOGGER.info("call: listAllCourse()");
		
		ModelAndView mav = new ModelAndView(COURSE_VIEW);
		mav.addObject("courses",courseservice.ListAllCourse());
		mav.addObject("course",courseconverter.EntityToModel(new Course()));
		return mav;
	}
	
	@PostMapping("/addcourse")
	public String addCourse(@ModelAttribute("course") CourseModel course) {
		
		LOGGER.info("call: addCourse() --param:"+course.toString()+" "+course.getDescription());	
		courseservice.AddCourse(courseconverter.ModelToEntity(course));
		return "redirect:/course/list";
	}

}
