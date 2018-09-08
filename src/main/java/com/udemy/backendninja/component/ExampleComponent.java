 package com.udemy.backendninja.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.udemy.backendninja.repository.CourseJpaRepository;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


@Component("ExampleComponent")
public class ExampleComponent {
	public static final Log LOG = LogFactory.getLog(ExampleComponent.class);
	
	@Autowired
	@Qualifier("courseJpaRepository")
	private CourseJpaRepository coursejparepository;
	
	public void SayHello() {
		LOG.info("Hello from Component");
	}
}
