package com.udemy.backendninja.component;

import org.springframework.stereotype.Component;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


@Component("ExampleComponent")
public class ExampleComponent {
	public static final Log LOG = LogFactory.getLog(ExampleComponent.class);
	
	public void SayHello() {
		LOG.info("Hello from Component");
	}
}
