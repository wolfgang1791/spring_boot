package com.udemy.backendninja.services.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.udemy.backendninja.entity.Course;
import com.udemy.backendninja.repository.CourseJpaRepository;
import com.udemy.backendninja.services.CourseService;

@Service("courseServiceImplementation")
public class CourseServiceImpl implements CourseService{
	
	
	private static final Log LOGGER = LogFactory.getLog(CourseServiceImpl.class);
	
	@Autowired
	@Qualifier("courseJpaRepository")
	private CourseJpaRepository coursejparepository;
	
	
	
	@Override
	public List<Course> ListAllCourse() {
		LOGGER.info("call: ListAllCourse()");
		return coursejparepository.findAll();
	}

	@Override
	public Course AddCourse(Course course) {
		LOGGER.info("call: addCourse() --: "+course.toString());
		return coursejparepository.save(course);
	}

	@Override
	public int RemoveCourse(int id) {
		coursejparepository.delete(id);
		return 0;
	}

	@Override
	public Course UpdateCourse(Course course) {
		return coursejparepository.save(course);
	}
	
	

}
