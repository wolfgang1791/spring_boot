package com.udemy.backendninja.converter;

import org.springframework.stereotype.Component;

import com.udemy.backendninja.entity.Course;
import com.udemy.backendninja.model.CourseModel;

@Component("courseConverter")
public class CourseConverter {
	
	public CourseModel EntityToModel(Course course) {
		CourseModel cm = new CourseModel();
		cm.setName(course.getName());
		cm.setDescription(course.getDescription());
		cm.setPrice(course.getPrice());
		cm.setHours(course.getHours());
		
		return cm;
	}
	
	public Course ModelToEntity(CourseModel coursemodel) {
		Course c = new Course();
		c.setName(coursemodel.getName());
		c.setDescription(coursemodel.getDescription());
		c.setPrice(coursemodel.getPrice());
		c.setHours(coursemodel.getHours());
		
		return c;
	}
	
	
}
