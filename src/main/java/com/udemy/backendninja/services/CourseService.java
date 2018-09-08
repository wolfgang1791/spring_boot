package com.udemy.backendninja.services;

import java.util.List;

import com.udemy.backendninja.entity.Course;

public interface CourseService {
	
	public abstract List<Course> ListAllCourse();
	public abstract Course AddCourse(Course course);
	public abstract int RemoveCourse(int id);
	public abstract Course UpdateCourse(Course course);
}
