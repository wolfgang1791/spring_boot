package com.udemy.backendninja.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.udemy.backendninja.component.ExampleComponent;
import com.udemy.backendninja.model.Person;
import com.udemy.backendninja.services.ExampleService;


@Service("exampleservice")
public class ExampleServiceImpl implements ExampleService {
    
	public static final Log LOG = LogFactory.getLog(ExampleComponent.class);
	
	public List<Person> getListPeople() {
		List<Person> people = new ArrayList<>();
		people.add(new Person("jon snow","40"));
		people.add(new Person("ned stark","50"));
		people.add(new Person("jajaja","60"));
		LOG.info("Hello from the service");
		return people;
	}

}
