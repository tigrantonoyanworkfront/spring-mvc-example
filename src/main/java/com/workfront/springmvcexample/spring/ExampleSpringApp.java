package com.workfront.springmvcexample.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExampleSpringApp {

	@Bean
	public SomeOtherBean getSomeOtherBean() {
		return new SomeOtherBean();
	}
}
